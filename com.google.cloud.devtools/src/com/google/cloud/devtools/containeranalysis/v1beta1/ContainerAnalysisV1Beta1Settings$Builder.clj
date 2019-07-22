(ns com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder
  "Builder for ContainerAnalysisV1Beta1Settings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 ContainerAnalysisV1Beta1Settings$Builder]))

(defn get-scan-config-settings
  "Returns the builder for the settings used for calls to getScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.containeranalysis.v1beta1.GetScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.getScanConfigSettings))))

(defn list-scan-configs-settings
  "Returns the builder for the settings used for calls to listScanConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.containeranalysis.v1beta1.ListScanConfigsResponse,com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.listScanConfigsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder [^ContainerAnalysisV1Beta1Settings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings$Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-scan-config-settings
  "Returns the builder for the settings used for calls to updateScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.containeranalysis.v1beta1.UpdateScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.updateScanConfigSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisV1Beta1Settings$Builder this]
    (-> this (.getIamPolicySettings))))

