(ns com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1 InstanceAdminClient$ListInstancesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPage>`"
  (^com.google.api.core.ApiFuture [^InstanceAdminClient$ListInstancesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

