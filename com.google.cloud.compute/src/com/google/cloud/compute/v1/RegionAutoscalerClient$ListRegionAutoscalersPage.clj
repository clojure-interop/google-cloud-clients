(ns com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionAutoscalerClient$ListRegionAutoscalersPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPage>`"
  (^com.google.api.core.ApiFuture [^RegionAutoscalerClient$ListRegionAutoscalersPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

