(ns core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.google.cloud.bigquery.core])
(require '[com.google.cloud.bigquery.benchmark.core])
(require '[com.google.cloud.bigquery.datatransfer.v1.core])
(require '[com.google.cloud.bigquery.datatransfer.v1.stub.core])
(require '[com.google.cloud.bigquery.spi.core])
(require '[com.google.cloud.bigquery.spi.v2.core])
(require '[com.google.cloud.bigquery.storage.v1beta1.core])
(require '[com.google.cloud.bigquery.storage.v1beta1.stub.core])
(require '[com.google.cloud.bigquery.storage.v1beta1.stub.readrows.core])
(require '[com.google.cloud.bigquery.testing.core])
