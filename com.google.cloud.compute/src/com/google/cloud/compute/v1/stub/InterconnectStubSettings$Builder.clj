(ns com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder
  "Builder for InterconnectStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectStubSettings$Builder]))

(defn patch-interconnect-settings
  "Returns the builder for the settings used for calls to patchInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectStubSettings$Builder this]
    (-> this (.patchInterconnectSettings))))

(defn get-diagnostics-interconnect-settings
  "Returns the builder for the settings used for calls to getDiagnosticsInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectStubSettings$Builder this]
    (-> this (.getDiagnosticsInterconnectSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder [^InterconnectStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn insert-interconnect-settings
  "Returns the builder for the settings used for calls to insertInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectStubSettings$Builder this]
    (-> this (.insertInterconnectSettings))))

(defn list-interconnects-settings
  "Returns the builder for the settings used for calls to listInterconnects.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InterconnectStubSettings$Builder this]
    (-> this (.listInterconnectsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.InterconnectStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.InterconnectStubSettings [^InterconnectStubSettings$Builder this]
    (-> this (.build))))

(defn delete-interconnect-settings
  "Returns the builder for the settings used for calls to deleteInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectStubSettings$Builder this]
    (-> this (.deleteInterconnectSettings))))

(defn get-interconnect-settings
  "Returns the builder for the settings used for calls to getInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectStubSettings$Builder this]
    (-> this (.getInterconnectSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^InterconnectStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

