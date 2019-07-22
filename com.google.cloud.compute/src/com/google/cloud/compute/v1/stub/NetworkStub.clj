(ns com.google.cloud.compute.v1.stub.NetworkStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NetworkStub]))

(defn ->network-stub
  "Constructor."
  (^NetworkStub []
    (new NetworkStub )))

(defn list-networks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.listNetworksPagedCallable))))

(defn insert-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.insertNetworkCallable))))

(defn remove-peering-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.removePeeringNetworkCallable))))

(defn patch-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.patchNetworkCallable))))

(defn get-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.getNetworkCallable))))

(defn switch-to-custom-mode-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.switchToCustomModeNetworkCallable))))

(defn close
  ""
  ([^NetworkStub this]
    (-> this (.close))))

(defn delete-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.deleteNetworkCallable))))

(defn add-peering-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.addPeeringNetworkCallable))))

(defn list-networks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkStub this]
    (-> this (.listNetworksCallable))))

