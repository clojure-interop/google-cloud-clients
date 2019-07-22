(ns com.google.cloud.asset.v1beta1.AssetServiceSettings$Builder
  "Builder for AssetServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1beta1 AssetServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder`"
  (^com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder [^AssetServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.asset.v1beta1.AssetServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.asset.v1beta1.AssetServiceSettings$Builder [^AssetServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn export-assets-settings
  "Returns the builder for the settings used for calls to exportAssets.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AssetServiceSettings$Builder this]
    (-> this (.exportAssetsSettings))))

(defn export-assets-operation-settings
  "Returns the builder for the settings used for calls to exportAssets.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.cloud.asset.v1beta1.ExportAssetsResponse,com.google.cloud.asset.v1beta1.ExportAssetsRequest>`"
  ([^AssetServiceSettings$Builder this]
    (-> this (.exportAssetsOperationSettings))))

(defn batch-get-assets-history-settings
  "Returns the builder for the settings used for calls to batchGetAssetsHistory.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AssetServiceSettings$Builder this]
    (-> this (.batchGetAssetsHistorySettings))))

(defn build
  "returns: `com.google.cloud.asset.v1beta1.AssetServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.asset.v1beta1.AssetServiceSettings [^AssetServiceSettings$Builder this]
    (-> this (.build))))

