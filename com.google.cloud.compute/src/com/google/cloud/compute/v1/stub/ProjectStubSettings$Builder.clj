(ns com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder
  "Builder for ProjectStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ProjectStubSettings$Builder]))

(defn set-default-network-tier-project-settings
  "Returns the builder for the settings used for calls to setDefaultNetworkTierProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.setDefaultNetworkTierProjectSettings))))

(defn move-disk-project-settings
  "Returns the builder for the settings used for calls to moveDiskProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.MoveDiskProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.moveDiskProjectSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder [^ProjectStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn disable-xpn-host-project-settings
  "Returns the builder for the settings used for calls to disableXpnHostProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.disableXpnHostProjectSettings))))

(defn set-usage-export-bucket-project-settings
  "Returns the builder for the settings used for calls to setUsageExportBucketProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.setUsageExportBucketProjectSettings))))

(defn disable-xpn-resource-project-settings
  "Returns the builder for the settings used for calls to disableXpnResourceProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.disableXpnResourceProjectSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.ProjectStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.ProjectStubSettings [^ProjectStubSettings$Builder this]
    (-> this (.build))))

(defn list-xpn-hosts-projects-settings
  "Returns the builder for the settings used for calls to listXpnHostsProjects.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.XpnHostList,com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.listXpnHostsProjectsSettings))))

(defn enable-xpn-host-project-settings
  "Returns the builder for the settings used for calls to enableXpnHostProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.enableXpnHostProjectSettings))))

(defn get-xpn-resources-projects-settings
  "Returns the builder for the settings used for calls to getXpnResourcesProjects.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectsGetXpnResources,com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.getXpnResourcesProjectsSettings))))

(defn get-xpn-host-project-settings
  "Returns the builder for the settings used for calls to getXpnHostProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.getXpnHostProjectSettings))))

(defn move-instance-project-settings
  "Returns the builder for the settings used for calls to moveInstanceProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.moveInstanceProjectSettings))))

(defn enable-xpn-resource-project-settings
  "Returns the builder for the settings used for calls to enableXpnResourceProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.enableXpnResourceProjectSettings))))

(defn get-project-settings
  "Returns the builder for the settings used for calls to getProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.getProjectSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ProjectStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn set-common-instance-metadata-project-settings
  "Returns the builder for the settings used for calls to setCommonInstanceMetadataProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProjectStubSettings$Builder this]
    (-> this (.setCommonInstanceMetadataProjectSettings))))

