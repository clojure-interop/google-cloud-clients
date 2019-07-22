(ns com.google.cloud.compute.v1.stub.UrlMapStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub UrlMapStub]))

(defn ->url-map-stub
  "Constructor."
  (^UrlMapStub []
    (new UrlMapStub )))

(defn delete-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.deleteUrlMapCallable))))

(defn get-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.getUrlMapCallable))))

(defn patch-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.patchUrlMapCallable))))

(defn insert-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.insertUrlMapCallable))))

(defn invalidate-cache-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.invalidateCacheUrlMapCallable))))

(defn validate-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.validateUrlMapCallable))))

(defn list-url-maps-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.listUrlMapsCallable))))

(defn update-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.updateUrlMapCallable))))

(defn close
  ""
  ([^UrlMapStub this]
    (-> this (.close))))

(defn list-url-maps-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapStub this]
    (-> this (.listUrlMapsPagedCallable))))

