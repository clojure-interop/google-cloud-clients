(ns com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder
  "Builder for RealmsServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub RealmsServiceStubSettings$Builder]))

(defn delete-realm-operation-settings
  "Returns the builder for the settings used for calls to deleteRealm.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^RealmsServiceStubSettings$Builder this]
    (-> this (.deleteRealmOperationSettings))))

(defn create-realm-settings
  "Returns the builder for the settings used for calls to createRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RealmsServiceStubSettings$Builder this]
    (-> this (.createRealmSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder [^RealmsServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn build
  "returns: `com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings [^RealmsServiceStubSettings$Builder this]
    (-> this (.build))))

(defn create-realm-operation-settings
  "Returns the builder for the settings used for calls to createRealm.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceStubSettings$Builder this]
    (-> this (.createRealmOperationSettings))))

(defn delete-realm-settings
  "Returns the builder for the settings used for calls to deleteRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RealmsServiceStubSettings$Builder this]
    (-> this (.deleteRealmSettings))))

(defn list-realms-settings
  "Returns the builder for the settings used for calls to listRealms.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.ListRealmsResponse,com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RealmsServiceStubSettings$Builder this]
    (-> this (.listRealmsSettings))))

(defn update-realm-settings
  "Returns the builder for the settings used for calls to updateRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RealmsServiceStubSettings$Builder this]
    (-> this (.updateRealmSettings))))

(defn update-realm-operation-settings
  "Returns the builder for the settings used for calls to updateRealm.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceStubSettings$Builder this]
    (-> this (.updateRealmOperationSettings))))

(defn get-realm-settings
  "Returns the builder for the settings used for calls to getRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetRealmRequest,com.google.cloud.gaming.v1alpha.Realm>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RealmsServiceStubSettings$Builder this]
    (-> this (.getRealmSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RealmsServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

