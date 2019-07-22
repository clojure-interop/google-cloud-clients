(ns com.google.cloud.spanner.BatchTransactionId
  "BatchTransactionId is unique identifier for BatchReadOnlyTransaction. It can be
  used to re-initialize a BatchReadOnlyTransaction on different machine or process by calling
  BatchClient.batchReadOnlyTransaction(BatchTransactionId)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner BatchTransactionId]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BatchTransactionId this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BatchTransactionId this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BatchTransactionId this]
    (-> this (.hashCode))))

