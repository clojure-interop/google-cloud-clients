(ns com.google.cloud.compute.v1.RouteClient$ListRoutesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouteClient$ListRoutesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.RouteClient$ListRoutesPage>`"
  (^com.google.api.core.ApiFuture [^RouteClient$ListRoutesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

