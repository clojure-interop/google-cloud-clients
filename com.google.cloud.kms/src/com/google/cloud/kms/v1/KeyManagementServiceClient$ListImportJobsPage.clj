(ns com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1 KeyManagementServiceClient$ListImportJobsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPage>`"
  (^com.google.api.core.ApiFuture [^KeyManagementServiceClient$ListImportJobsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

