(ns com.google.cloud.logging.v2.ConfigClient$ListExclusionsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 ConfigClient$ListExclusionsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.v2.ConfigClient$ListExclusionsPage>`"
  (^com.google.api.core.ApiFuture [^ConfigClient$ListExclusionsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

