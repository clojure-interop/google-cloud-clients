(ns com.google.cloud.compute.v1.stub.RouterStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RouterStub]))

(defn ->router-stub
  "Constructor."
  (^RouterStub []
    (new RouterStub )))

(defn insert-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.insertRouterCallable))))

(defn patch-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.patchRouterCallable))))

(defn list-routers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.listRoutersPagedCallable))))

(defn get-router-status-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.getRouterStatusRouterCallable))))

(defn list-routers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.listRoutersCallable))))

(defn get-nat-mapping-info-routers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.getNatMappingInfoRoutersPagedCallable))))

(defn get-nat-mapping-info-routers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.getNatMappingInfoRoutersCallable))))

(defn preview-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.previewRouterCallable))))

(defn update-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.updateRouterCallable))))

(defn close
  ""
  ([^RouterStub this]
    (-> this (.close))))

(defn delete-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.deleteRouterCallable))))

(defn get-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.getRouterCallable))))

(defn aggregated-list-routers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.aggregatedListRoutersCallable))))

(defn aggregated-list-routers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterStub this]
    (-> this (.aggregatedListRoutersPagedCallable))))

