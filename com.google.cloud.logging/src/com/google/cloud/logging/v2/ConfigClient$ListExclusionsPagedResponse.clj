(ns com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 ConfigClient$ListExclusionsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ConfigClient$ListExclusionsPagedResponse/createAsync context future-response)))

