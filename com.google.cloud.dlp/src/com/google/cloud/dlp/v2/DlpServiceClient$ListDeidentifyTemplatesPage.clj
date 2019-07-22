(ns com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dlp.v2 DlpServiceClient$ListDeidentifyTemplatesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPage>`"
  (^com.google.api.core.ApiFuture [^DlpServiceClient$ListDeidentifyTemplatesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

