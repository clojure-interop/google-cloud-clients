(ns com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsInProductSetPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p4beta1 ProductSearchClient$ListProductsInProductSetPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsInProductSetPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ProductSearchClient$ListProductsInProductSetPagedResponse/createAsync context future-response)))

