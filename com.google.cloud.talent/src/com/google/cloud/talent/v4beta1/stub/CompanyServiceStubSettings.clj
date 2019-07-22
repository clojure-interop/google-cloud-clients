(ns com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings
  "Settings class to configure an instance of CompanyServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createCompany to 30 seconds:



  CompanyServiceStubSettings.Builder companyServiceSettingsBuilder =
      CompanyServiceStubSettings.newBuilder();
  companyServiceSettingsBuilder.createCompanySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CompanyServiceStubSettings companyServiceSettings = companyServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub CompanyServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CompanyServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CompanyServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CompanyServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CompanyServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CompanyServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CompanyServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CompanyServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CompanyServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder []
    (CompanyServiceStubSettings/newBuilder )))

(defn create-company-settings
  "Returns the object with the settings used for calls to createCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceStubSettings this]
    (-> this (.createCompanySettings))))

(defn get-company-settings
  "Returns the object with the settings used for calls to getCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceStubSettings this]
    (-> this (.getCompanySettings))))

(defn update-company-settings
  "Returns the object with the settings used for calls to updateCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceStubSettings this]
    (-> this (.updateCompanySettings))))

(defn delete-company-settings
  "Returns the object with the settings used for calls to deleteCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteCompanyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceStubSettings this]
    (-> this (.deleteCompanySettings))))

(defn list-companies-settings
  "Returns the object with the settings used for calls to listCompanies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.ListCompaniesResponse,com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CompanyServiceStubSettings this]
    (-> this (.listCompaniesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.CompanyServiceStub`

  throws: java.io.IOException"
  ([^CompanyServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder [^CompanyServiceStubSettings this]
    (-> this (.toBuilder))))

