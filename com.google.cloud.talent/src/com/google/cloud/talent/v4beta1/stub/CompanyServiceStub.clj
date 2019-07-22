(ns com.google.cloud.talent.v4beta1.stub.CompanyServiceStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub CompanyServiceStub]))

(defn ->company-service-stub
  "Constructor."
  (^CompanyServiceStub []
    (new CompanyServiceStub )))

(defn create-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceStub this]
    (-> this (.createCompanyCallable))))

(defn get-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceStub this]
    (-> this (.getCompanyCallable))))

(defn update-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceStub this]
    (-> this (.updateCompanyCallable))))

(defn delete-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteCompanyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceStub this]
    (-> this (.deleteCompanyCallable))))

(defn list-companies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceStub this]
    (-> this (.listCompaniesPagedCallable))))

(defn list-companies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.ListCompaniesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceStub this]
    (-> this (.listCompaniesCallable))))

(defn close
  ""
  ([^CompanyServiceStub this]
    (-> this (.close))))

