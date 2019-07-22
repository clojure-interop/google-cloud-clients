(ns com.google.cloud.datastore.TransactionExceptionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore TransactionExceptionHandler]))

(def *-transaction-exception-handler-interceptor
  "Static Constant.

  type: com.google.cloud.ExceptionHandler$Interceptor"
  TransactionExceptionHandler/TRANSACTION_EXCEPTION_HANDLER_INTERCEPTOR)

(defn *build
  "returns: `com.google.cloud.ExceptionHandler`"
  (^com.google.cloud.ExceptionHandler []
    (TransactionExceptionHandler/build )))

