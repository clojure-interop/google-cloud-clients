(ns com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1 DataCatalogClient$ListTagsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPage>`"
  (^com.google.api.core.ApiFuture [^DataCatalogClient$ListTagsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

