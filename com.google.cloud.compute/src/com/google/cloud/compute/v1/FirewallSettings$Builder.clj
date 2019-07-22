(ns com.google.cloud.compute.v1.FirewallSettings$Builder
  "Builder for FirewallSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FirewallSettings$Builder]))

(defn insert-firewall-settings
  "Returns the builder for the settings used for calls to insertFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirewallSettings$Builder this]
    (-> this (.insertFirewallSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.FirewallSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.FirewallSettings$Builder [^FirewallSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-firewall-settings
  "Returns the builder for the settings used for calls to deleteFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirewallSettings$Builder this]
    (-> this (.deleteFirewallSettings))))

(defn update-firewall-settings
  "Returns the builder for the settings used for calls to updateFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirewallSettings$Builder this]
    (-> this (.updateFirewallSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.FirewallSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.FirewallSettings [^FirewallSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.FirewallStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.FirewallStubSettings$Builder [^FirewallSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn list-firewalls-settings
  "Returns the builder for the settings used for calls to listFirewalls.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallList,com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirewallSettings$Builder this]
    (-> this (.listFirewallsSettings))))

(defn patch-firewall-settings
  "Returns the builder for the settings used for calls to patchFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirewallSettings$Builder this]
    (-> this (.patchFirewallSettings))))

(defn get-firewall-settings
  "Returns the builder for the settings used for calls to getFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetFirewallHttpRequest,com.google.cloud.compute.v1.Firewall>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirewallSettings$Builder this]
    (-> this (.getFirewallSettings))))

