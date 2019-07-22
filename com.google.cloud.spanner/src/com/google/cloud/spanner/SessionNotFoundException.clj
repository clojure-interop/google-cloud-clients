(ns com.google.cloud.spanner.SessionNotFoundException
  "Exception thrown by Cloud Spanner when an operation detects that the session that is being used
  is no longer valid. This type of error has its own subclass as it is a condition that should
  normally be hidden from the user, and the client library should try to fix this internally."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SessionNotFoundException]))

