(ns com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p3beta1 ProductSearchClient$ListProductsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPage>`"
  (^com.google.api.core.ApiFuture [^ProductSearchClient$ListProductsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

