(ns com.google.cloud.compute.v1.NetworkSettings$Builder
  "Builder for NetworkSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.NetworkSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.NetworkSettings$Builder [^NetworkSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn add-peering-network-settings
  "Returns the builder for the settings used for calls to addPeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.addPeeringNetworkSettings))))

(defn patch-network-settings
  "Returns the builder for the settings used for calls to patchNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.patchNetworkSettings))))

(defn insert-network-settings
  "Returns the builder for the settings used for calls to insertNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.insertNetworkSettings))))

(defn get-network-settings
  "Returns the builder for the settings used for calls to getNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.getNetworkSettings))))

(defn switch-to-custom-mode-network-settings
  "Returns the builder for the settings used for calls to switchToCustomModeNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.switchToCustomModeNetworkSettings))))

(defn remove-peering-network-settings
  "Returns the builder for the settings used for calls to removePeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.removePeeringNetworkSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NetworkSettings [^NetworkSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder [^NetworkSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn delete-network-settings
  "Returns the builder for the settings used for calls to deleteNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.deleteNetworkSettings))))

(defn list-networks-settings
  "Returns the builder for the settings used for calls to listNetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkSettings$Builder this]
    (-> this (.listNetworksSettings))))

