(ns com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneOperationClient$ListZoneOperationsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPage>`"
  (^com.google.api.core.ApiFuture [^ZoneOperationClient$ListZoneOperationsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

