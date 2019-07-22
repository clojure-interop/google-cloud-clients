(ns com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1 KeyManagementServiceClient$ListImportJobsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (KeyManagementServiceClient$ListImportJobsPagedResponse/createAsync context future-response)))

