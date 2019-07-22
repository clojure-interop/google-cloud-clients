(ns com.google.cloud.logging.v2.ConfigClient$ListSinksPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 ConfigClient$ListSinksPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.v2.ConfigClient$ListSinksPage>`"
  (^com.google.api.core.ApiFuture [^ConfigClient$ListSinksPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

