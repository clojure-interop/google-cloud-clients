(ns com.google.cloud.compute.v1.RouterClient$ListRoutersPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterClient$ListRoutersPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.RouterClient$ListRoutersPage>`"
  (^com.google.api.core.ApiFuture [^RouterClient$ListRoutersPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

