(ns com.google.cloud.compute.v1.stub.ProjectStubSettings
  "Settings class to configure an instance of ProjectStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of disableXpnHostProject to 30 seconds:



  ProjectStubSettings.Builder projectSettingsBuilder =
      ProjectStubSettings.newBuilder();
  projectSettingsBuilder.disableXpnHostProjectSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ProjectStubSettings projectSettings = projectSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ProjectStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (ProjectStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ProjectStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ProjectStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ProjectStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ProjectStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder []
    (ProjectStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ProjectStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (ProjectStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ProjectStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ProjectStubSettings/getDefaultServiceScopes )))

(defn set-default-network-tier-project-settings
  "Returns the object with the settings used for calls to setDefaultNetworkTierProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.setDefaultNetworkTierProjectSettings))))

(defn move-disk-project-settings
  "Returns the object with the settings used for calls to moveDiskProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.MoveDiskProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.moveDiskProjectSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ProjectStub`

  throws: java.io.IOException"
  ([^ProjectStubSettings this]
    (-> this (.createStub))))

(defn disable-xpn-host-project-settings
  "Returns the object with the settings used for calls to disableXpnHostProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.disableXpnHostProjectSettings))))

(defn set-usage-export-bucket-project-settings
  "Returns the object with the settings used for calls to setUsageExportBucketProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.setUsageExportBucketProjectSettings))))

(defn disable-xpn-resource-project-settings
  "Returns the object with the settings used for calls to disableXpnResourceProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.disableXpnResourceProjectSettings))))

(defn list-xpn-hosts-projects-settings
  "Returns the object with the settings used for calls to listXpnHostsProjects.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.XpnHostList,com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProjectStubSettings this]
    (-> this (.listXpnHostsProjectsSettings))))

(defn enable-xpn-host-project-settings
  "Returns the object with the settings used for calls to enableXpnHostProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.enableXpnHostProjectSettings))))

(defn get-xpn-resources-projects-settings
  "Returns the object with the settings used for calls to getXpnResourcesProjects.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectsGetXpnResources,com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProjectStubSettings this]
    (-> this (.getXpnResourcesProjectsSettings))))

(defn get-xpn-host-project-settings
  "Returns the object with the settings used for calls to getXpnHostProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.getXpnHostProjectSettings))))

(defn move-instance-project-settings
  "Returns the object with the settings used for calls to moveInstanceProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.moveInstanceProjectSettings))))

(defn enable-xpn-resource-project-settings
  "Returns the object with the settings used for calls to enableXpnResourceProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.enableXpnResourceProjectSettings))))

(defn get-project-settings
  "Returns the object with the settings used for calls to getProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.getProjectSettings))))

(defn set-common-instance-metadata-project-settings
  "Returns the object with the settings used for calls to setCommonInstanceMetadataProject.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProjectStubSettings this]
    (-> this (.setCommonInstanceMetadataProjectSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ProjectStubSettings$Builder [^ProjectStubSettings this]
    (-> this (.toBuilder))))

