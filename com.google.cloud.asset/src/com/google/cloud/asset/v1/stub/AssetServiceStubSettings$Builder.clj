(ns com.google.cloud.asset.v1.stub.AssetServiceStubSettings$Builder
  "Builder for AssetServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1.stub AssetServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.asset.v1.stub.AssetServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.asset.v1.stub.AssetServiceStubSettings$Builder [^AssetServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^AssetServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn export-assets-settings
  "Returns the builder for the settings used for calls to exportAssets.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.asset.v1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AssetServiceStubSettings$Builder this]
    (-> this (.exportAssetsSettings))))

(defn export-assets-operation-settings
  "Returns the builder for the settings used for calls to exportAssets.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.asset.v1.ExportAssetsRequest,com.google.cloud.asset.v1.ExportAssetsResponse,com.google.cloud.asset.v1.ExportAssetsRequest>`"
  ([^AssetServiceStubSettings$Builder this]
    (-> this (.exportAssetsOperationSettings))))

(defn batch-get-assets-history-settings
  "Returns the builder for the settings used for calls to batchGetAssetsHistory.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.asset.v1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AssetServiceStubSettings$Builder this]
    (-> this (.batchGetAssetsHistorySettings))))

(defn build
  "returns: `com.google.cloud.asset.v1.stub.AssetServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.asset.v1.stub.AssetServiceStubSettings [^AssetServiceStubSettings$Builder this]
    (-> this (.build))))

