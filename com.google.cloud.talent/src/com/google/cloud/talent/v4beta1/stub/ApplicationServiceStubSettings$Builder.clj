(ns com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder
  "Builder for ApplicationServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub ApplicationServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder [^ApplicationServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ApplicationServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-application-settings
  "Returns the builder for the settings used for calls to createApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ApplicationServiceStubSettings$Builder this]
    (-> this (.createApplicationSettings))))

(defn get-application-settings
  "Returns the builder for the settings used for calls to getApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.GetApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ApplicationServiceStubSettings$Builder this]
    (-> this (.getApplicationSettings))))

(defn update-application-settings
  "Returns the builder for the settings used for calls to updateApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.UpdateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ApplicationServiceStubSettings$Builder this]
    (-> this (.updateApplicationSettings))))

(defn delete-application-settings
  "Returns the builder for the settings used for calls to deleteApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.DeleteApplicationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ApplicationServiceStubSettings$Builder this]
    (-> this (.deleteApplicationSettings))))

(defn list-applications-settings
  "Returns the builder for the settings used for calls to listApplications.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ListApplicationsResponse,com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ApplicationServiceStubSettings$Builder this]
    (-> this (.listApplicationsSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings [^ApplicationServiceStubSettings$Builder this]
    (-> this (.build))))

