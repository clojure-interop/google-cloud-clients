(ns com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 GroupServiceClient$ListGroupsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPage>`"
  (^com.google.api.core.ApiFuture [^GroupServiceClient$ListGroupsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

