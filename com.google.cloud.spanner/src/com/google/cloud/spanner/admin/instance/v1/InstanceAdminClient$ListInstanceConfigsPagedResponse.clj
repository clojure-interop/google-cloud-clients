(ns com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1 InstanceAdminClient$ListInstanceConfigsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (InstanceAdminClient$ListInstanceConfigsPagedResponse/createAsync context future-response)))

