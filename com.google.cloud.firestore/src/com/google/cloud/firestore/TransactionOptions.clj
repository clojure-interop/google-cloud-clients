(ns com.google.cloud.firestore.TransactionOptions
  "Options specifying the behavior of Firestore Transactions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore TransactionOptions]))

(defn *create
  "Create a default set of options with a custom executor and a custom number of retry attempts.

  executor - The executor to run the user callback code on. - `java.util.concurrent.Executor`
  number-of-attempts - The number of execution attempts. - `int`

  returns: The TransactionOptions object. - `com.google.cloud.firestore.TransactionOptions`"
  (^com.google.cloud.firestore.TransactionOptions [^java.util.concurrent.Executor executor ^Integer number-of-attempts]
    (TransactionOptions/create executor number-of-attempts))
  (^com.google.cloud.firestore.TransactionOptions [^Integer number-of-attempts]
    (TransactionOptions/create number-of-attempts))
  (^com.google.cloud.firestore.TransactionOptions []
    (TransactionOptions/create )))

(defn get-number-of-attempts
  "returns: `int`"
  (^Integer [^TransactionOptions this]
    (-> this (.getNumberOfAttempts))))

(defn get-executor
  "returns: `java.util.concurrent.Executor`"
  (^java.util.concurrent.Executor [^TransactionOptions this]
    (-> this (.getExecutor))))

