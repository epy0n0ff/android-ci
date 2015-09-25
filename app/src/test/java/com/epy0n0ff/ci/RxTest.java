package com.epy0n0ff.ci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import rx.Observable;
import rx.Subscriber;
import rx.observers.TestSubscriber;
import rx.schedulers.Schedulers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Async task test
 * Created by epy0n0ff on 2015/09/25.
 */
@RunWith(RobolectricGradleTestRunner.class) @Config(
    sdk = 21,
    constants = BuildConfig.class) public class RxTest {
  @Test public void asyncTest() {
    Observable<Object> testObservable = Observable.create(new Observable.OnSubscribe<Object>() {
      @Override public void call(final Subscriber<? super Object> subscriber) {
        try {
          Thread.sleep(3000);
          subscriber.onNext(new Object());
          subscriber.onCompleted();
        } catch (InterruptedException e) {
          subscriber.onError(e);
        }
      }
    }).observeOn(Schedulers.newThread());

    TestSubscriber<Object> testSubscriber = new TestSubscriber<>();
    testObservable.subscribe(testSubscriber);

    testSubscriber.awaitTerminalEvent();
    testSubscriber.assertNoErrors();
    testSubscriber.assertCompleted();

    assertThat("check onNextEvents size", testSubscriber.getOnNextEvents().size(), is(1));
  }
}
