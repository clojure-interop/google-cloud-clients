(ns com.google.cloud.talent.v4beta1.CompanyServiceSettings
  "Settings class to configure an instance of CompanyServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createCompany to 30 seconds:



  CompanyServiceSettings.Builder companyServiceSettingsBuilder =
      CompanyServiceSettings.newBuilder();
  companyServiceSettingsBuilder.createCompanySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CompanyServiceSettings companyServiceSettings = companyServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 CompanyServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CompanyServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CompanyServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CompanyServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CompanyServiceSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder []
    (CompanyServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CompanyServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings`

  returns: `com.google.cloud.talent.v4beta1.CompanyServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings [^com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings stub]
    (CompanyServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CompanyServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CompanyServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CompanyServiceSettings/getDefaultServiceScopes )))

(defn create-company-settings
  "Returns the object with the settings used for calls to createCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceSettings this]
    (-> this (.createCompanySettings))))

(defn get-company-settings
  "Returns the object with the settings used for calls to getCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceSettings this]
    (-> this (.getCompanySettings))))

(defn update-company-settings
  "Returns the object with the settings used for calls to updateCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceSettings this]
    (-> this (.updateCompanySettings))))

(defn delete-company-settings
  "Returns the object with the settings used for calls to deleteCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteCompanyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompanyServiceSettings this]
    (-> this (.deleteCompanySettings))))

(defn list-companies-settings
  "Returns the object with the settings used for calls to listCompanies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.ListCompaniesResponse,com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CompanyServiceSettings this]
    (-> this (.listCompaniesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder [^CompanyServiceSettings this]
    (-> this (.toBuilder))))

