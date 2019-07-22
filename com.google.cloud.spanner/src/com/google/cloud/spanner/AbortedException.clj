(ns com.google.cloud.spanner.AbortedException
  "Exception thrown by Cloud Spanner when an operation detects that a transaction has aborted. This
  type of error has its own subclass since it is often necessary to handle aborted differently to
  other types of errors, most typically by retrying the transaction."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner AbortedException]))

