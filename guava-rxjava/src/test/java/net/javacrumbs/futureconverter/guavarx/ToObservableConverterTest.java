/**
 * Copyright 2009-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.javacrumbs.futureconverter.guavarx;

import com.google.common.util.concurrent.ListenableFuture;
import net.javacrumbs.futureconverter.common.test.guava.GuavaOriginalFutureTestHelper;
import net.javacrumbs.futureconverter.common.test.rxjava.AbstractFutureToObservableConverterTest;
import rx.Observable;

public class ToObservableConverterTest extends AbstractFutureToObservableConverterTest<ListenableFuture<String>> {

    public ToObservableConverterTest() {
        super(new GuavaOriginalFutureTestHelper());
    }

    @Override
    protected Observable<String> toObservable(ListenableFuture<String> future) {
        return FutureConverter.toObservable(future);
    }

    @Override
    protected ListenableFuture<String> toFuture(Observable<String> observable) {
        return FutureConverter.toListenableFuture(observable);
    }
}
