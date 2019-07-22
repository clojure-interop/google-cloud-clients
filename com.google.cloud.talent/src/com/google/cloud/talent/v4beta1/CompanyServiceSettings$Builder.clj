(ns com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder
  "Builder for CompanyServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 CompanyServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder [^CompanyServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder [^CompanyServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-company-settings
  "Returns the builder for the settings used for calls to createCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CompanyServiceSettings$Builder this]
    (-> this (.createCompanySettings))))

(defn get-company-settings
  "Returns the builder for the settings used for calls to getCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.GetCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CompanyServiceSettings$Builder this]
    (-> this (.getCompanySettings))))

(defn update-company-settings
  "Returns the builder for the settings used for calls to updateCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.UpdateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CompanyServiceSettings$Builder this]
    (-> this (.updateCompanySettings))))

(defn delete-company-settings
  "Returns the builder for the settings used for calls to deleteCompany.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.DeleteCompanyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CompanyServiceSettings$Builder this]
    (-> this (.deleteCompanySettings))))

(defn list-companies-settings
  "Returns the builder for the settings used for calls to listCompanies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.ListCompaniesResponse,com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CompanyServiceSettings$Builder this]
    (-> this (.listCompaniesSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.CompanyServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings [^CompanyServiceSettings$Builder this]
    (-> this (.build))))

