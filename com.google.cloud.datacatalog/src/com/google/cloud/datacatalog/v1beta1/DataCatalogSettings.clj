(ns com.google.cloud.datacatalog.v1beta1.DataCatalogSettings
  "Settings class to configure an instance of DataCatalogClient.

  The default instance has everything set to sensible defaults:


    The default service address (datacatalog.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of updateEntry to 30 seconds:



  DataCatalogSettings.Builder dataCatalogSettingsBuilder =
      DataCatalogSettings.newBuilder();
  dataCatalogSettingsBuilder.updateEntrySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DataCatalogSettings dataCatalogSettings = dataCatalogSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1 DataCatalogSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DataCatalogSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DataCatalogSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DataCatalogSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogSettings$Builder`"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DataCatalogSettings/newBuilder client-context))
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogSettings$Builder []
    (DataCatalogSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DataCatalogSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings`

  returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogSettings`

  throws: java.io.IOException"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogSettings [^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings stub]
    (DataCatalogSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DataCatalogSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DataCatalogSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DataCatalogSettings/getDefaultServiceScopes )))

(defn search-catalog-settings
  "Returns the object with the settings used for calls to searchCatalog.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.SearchCatalogResponse,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataCatalogSettings this]
    (-> this (.searchCatalogSettings))))

(defn create-tag-settings
  "Returns the object with the settings used for calls to createTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.CreateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.createTagSettings))))

(defn update-tag-template-field-settings
  "Returns the object with the settings used for calls to updateTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.updateTagTemplateFieldSettings))))

(defn lookup-entry-settings
  "Returns the object with the settings used for calls to lookupEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.LookupEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.lookupEntrySettings))))

(defn list-tags-settings
  "Returns the object with the settings used for calls to listTags.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.ListTagsResponse,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataCatalogSettings this]
    (-> this (.listTagsSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn update-entry-settings
  "Returns the object with the settings used for calls to updateEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.updateEntrySettings))))

(defn rename-tag-template-field-settings
  "Returns the object with the settings used for calls to renameTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.RenameTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.renameTagTemplateFieldSettings))))

(defn update-tag-template-settings
  "Returns the object with the settings used for calls to updateTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.updateTagTemplateSettings))))

(defn get-entry-settings
  "Returns the object with the settings used for calls to getEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.GetEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.getEntrySettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.setIamPolicySettings))))

(defn update-tag-settings
  "Returns the object with the settings used for calls to updateTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.updateTagSettings))))

(defn delete-tag-template-field-settings
  "Returns the object with the settings used for calls to deleteTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.deleteTagTemplateFieldSettings))))

(defn delete-tag-template-settings
  "Returns the object with the settings used for calls to deleteTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.DeleteTagTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.deleteTagTemplateSettings))))

(defn delete-tag-settings
  "Returns the object with the settings used for calls to deleteTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.DeleteTagRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.deleteTagSettings))))

(defn get-tag-template-settings
  "Returns the object with the settings used for calls to getTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.GetTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.getTagTemplateSettings))))

(defn create-tag-template-field-settings
  "Returns the object with the settings used for calls to createTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.CreateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.createTagTemplateFieldSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.getIamPolicySettings))))

(defn create-tag-template-settings
  "Returns the object with the settings used for calls to createTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.CreateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogSettings this]
    (-> this (.createTagTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogSettings$Builder`"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogSettings$Builder [^DataCatalogSettings this]
    (-> this (.toBuilder))))

