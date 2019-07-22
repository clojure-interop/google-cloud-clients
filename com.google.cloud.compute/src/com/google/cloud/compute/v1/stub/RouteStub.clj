(ns com.google.cloud.compute.v1.stub.RouteStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RouteStub]))

(defn ->route-stub
  "Constructor."
  (^RouteStub []
    (new RouteStub )))

(defn delete-route-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteStub this]
    (-> this (.deleteRouteCallable))))

(defn get-route-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteStub this]
    (-> this (.getRouteCallable))))

(defn insert-route-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteStub this]
    (-> this (.insertRouteCallable))))

(defn list-routes-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteStub this]
    (-> this (.listRoutesPagedCallable))))

(defn list-routes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteStub this]
    (-> this (.listRoutesCallable))))

(defn close
  ""
  ([^RouteStub this]
    (-> this (.close))))

