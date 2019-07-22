(ns com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p3beta1 ProductSearchClient$ListProductsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ProductSearchClient$ListProductsPagedResponse/createAsync context future-response)))

