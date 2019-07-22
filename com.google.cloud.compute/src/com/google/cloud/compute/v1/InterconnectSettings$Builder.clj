(ns com.google.cloud.compute.v1.InterconnectSettings$Builder
  "Builder for InterconnectSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectSettings$Builder]))

(defn patch-interconnect-settings
  "Returns the builder for the settings used for calls to patchInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectSettings$Builder this]
    (-> this (.patchInterconnectSettings))))

(defn get-diagnostics-interconnect-settings
  "Returns the builder for the settings used for calls to getDiagnosticsInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectSettings$Builder this]
    (-> this (.getDiagnosticsInterconnectSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.InterconnectSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.InterconnectSettings$Builder [^InterconnectSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn insert-interconnect-settings
  "Returns the builder for the settings used for calls to insertInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectSettings$Builder this]
    (-> this (.insertInterconnectSettings))))

(defn list-interconnects-settings
  "Returns the builder for the settings used for calls to listInterconnects.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InterconnectSettings$Builder this]
    (-> this (.listInterconnectsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectSettings [^InterconnectSettings$Builder this]
    (-> this (.build))))

(defn delete-interconnect-settings
  "Returns the builder for the settings used for calls to deleteInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectSettings$Builder this]
    (-> this (.deleteInterconnectSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder [^InterconnectSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-interconnect-settings
  "Returns the builder for the settings used for calls to getInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectSettings$Builder this]
    (-> this (.getInterconnectSettings))))

