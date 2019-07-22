(ns com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha GameServerClustersServiceClient$ListGameServerClustersPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPage>`"
  (^com.google.api.core.ApiFuture [^GameServerClustersServiceClient$ListGameServerClustersPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

