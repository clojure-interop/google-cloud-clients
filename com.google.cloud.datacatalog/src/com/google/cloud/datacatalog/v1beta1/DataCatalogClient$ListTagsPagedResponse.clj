(ns com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1 DataCatalogClient$ListTagsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DataCatalogClient$ListTagsPagedResponse/createAsync context future-response)))

