(ns com.google.cloud.talent.v4beta1.CompanyServiceClient
  "Service Description: A service that handles company management, including CRUD and enumeration.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
    TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
    Company company = Company.newBuilder().build();
    Company response = companyServiceClient.createCompany(parent, company);
  }

  Note: close() needs to be called on the companyServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of CompanyServiceSettings to
  create(). For example:

  To customize credentials:



  CompanyServiceSettings companyServiceSettings =
      CompanyServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  CompanyServiceClient companyServiceClient =
      CompanyServiceClient.create(companyServiceSettings);

  To customize the endpoint:



  CompanyServiceSettings companyServiceSettings =
      CompanyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  CompanyServiceClient companyServiceClient =
      CompanyServiceClient.create(companyServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 CompanyServiceClient]))

(defn *create
  "Constructs an instance of CompanyServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.CompanyServiceSettings`

  returns: `com.google.cloud.talent.v4beta1.CompanyServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.CompanyServiceClient [^com.google.cloud.talent.v4beta1.CompanyServiceSettings settings]
    (CompanyServiceClient/create settings))
  (^com.google.cloud.talent.v4beta1.CompanyServiceClient []
    (CompanyServiceClient/create )))

(defn create-company-callable
  "Creates a new company entity.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Company company = Company.newBuilder().build();
     CreateCompanyRequest request = CreateCompanyRequest.newBuilder()
       .setParent(parent.toString())
       .setCompany(company)
       .build();
     ApiFuture<Company> future = companyServiceClient.createCompanyCallable().futureCall(request);
     // Do something
     Company response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceClient this]
    (-> this (.createCompanyCallable))))

(defn update-company
  "Updates specified company.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     Company company = Company.newBuilder().build();
     Company response = companyServiceClient.updateCompany(company);
   }

  company - Required. The company resource to replace the current resource in the system. - `com.google.cloud.talent.v4beta1.Company`

  returns: `com.google.cloud.talent.v4beta1.Company`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Company [^CompanyServiceClient this ^com.google.cloud.talent.v4beta1.Company company]
    (-> this (.updateCompany company))))

(defn delete-company-callable
  "Deletes specified company. Prerequisite: The company has no jobs associated with it.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     CompanyName name = CompanyWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[COMPANY]\");
     DeleteCompanyRequest request = DeleteCompanyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = companyServiceClient.deleteCompanyCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteCompanyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceClient this]
    (-> this (.deleteCompanyCallable))))

(defn create-company
  "Creates a new company entity.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Company company = Company.newBuilder().build();
     Company response = companyServiceClient.createCompany(parent, company);
   }

  parent - Required. Resource name of the tenant under which the company is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and a default tenant is created if unspecified, for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.TenantOrProjectName`
  company - Required. The company to be created. - `com.google.cloud.talent.v4beta1.Company`

  returns: `com.google.cloud.talent.v4beta1.Company`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Company [^CompanyServiceClient this ^com.google.cloud.talent.v4beta1.TenantOrProjectName parent ^com.google.cloud.talent.v4beta1.Company company]
    (-> this (.createCompany parent company)))
  (^com.google.cloud.talent.v4beta1.Company [^CompanyServiceClient this ^com.google.cloud.talent.v4beta1.CreateCompanyRequest request]
    (-> this (.createCompany request))))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.CompanyServiceSettings`"
  (^com.google.cloud.talent.v4beta1.CompanyServiceSettings [^CompanyServiceClient this]
    (-> this (.getSettings))))

(defn update-company-callable
  "Updates specified company.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     Company company = Company.newBuilder().build();
     UpdateCompanyRequest request = UpdateCompanyRequest.newBuilder()
       .setCompany(company)
       .build();
     ApiFuture<Company> future = companyServiceClient.updateCompanyCallable().futureCall(request);
     // Do something
     Company response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceClient this]
    (-> this (.updateCompanyCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.CompanyServiceStub`"
  ([^CompanyServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^CompanyServiceClient this]
    (-> this (.isShutdown))))

(defn list-companies
  "Lists all companies associated with the project.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     for (Company element : companyServiceClient.listCompanies(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Resource name of the tenant under which the company is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.TenantOrProjectName`

  returns: `com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse [^CompanyServiceClient this ^com.google.cloud.talent.v4beta1.TenantOrProjectName parent]
    (-> this (.listCompanies parent))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^CompanyServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^CompanyServiceClient this]
    (-> this (.shutdown))))

(defn list-companies-callable
  "Lists all companies associated with the project.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     ListCompaniesRequest request = ListCompaniesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListCompaniesResponse response = companyServiceClient.listCompaniesCallable().call(request);
       for (Company element : response.getCompaniesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.ListCompaniesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceClient this]
    (-> this (.listCompaniesCallable))))

(defn close
  ""
  ([^CompanyServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^CompanyServiceClient this]
    (-> this (.isTerminated))))

(defn list-companies-paged-callable
  "Lists all companies associated with the project.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     ListCompaniesRequest request = ListCompaniesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListCompaniesPagedResponse> future = companyServiceClient.listCompaniesPagedCallable().futureCall(request);
     // Do something
     for (Company element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceClient this]
    (-> this (.listCompaniesPagedCallable))))

(defn get-company
  "Retrieves specified company.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     CompanyName name = CompanyWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[COMPANY]\");
     Company response = companyServiceClient.getCompany(name);
   }

  name - Required. The resource name of the company to be retrieved. The format is \"projects/{project_id}/tenants/{tenant_id}/companies/{company_id}\", for example, \"projects/api-test-project/tenants/foo/companies/bar\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project/companies/bar\". - `com.google.cloud.talent.v4beta1.CompanyName`

  returns: `com.google.cloud.talent.v4beta1.Company`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Company [^CompanyServiceClient this ^com.google.cloud.talent.v4beta1.CompanyName name]
    (-> this (.getCompany name))))

(defn shutdown-now
  ""
  ([^CompanyServiceClient this]
    (-> this (.shutdownNow))))

(defn get-company-callable
  "Retrieves specified company.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     CompanyName name = CompanyWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[COMPANY]\");
     GetCompanyRequest request = GetCompanyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Company> future = companyServiceClient.getCompanyCallable().futureCall(request);
     // Do something
     Company response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompanyServiceClient this]
    (-> this (.getCompanyCallable))))

(defn delete-company
  "Deletes specified company. Prerequisite: The company has no jobs associated with it.

   Sample code:



   try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
     CompanyName name = CompanyWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[COMPANY]\");
     companyServiceClient.deleteCompany(name);
   }

  name - Required. The resource name of the company to be deleted. The format is \"projects/{project_id}/tenants/{tenant_id}/companies/{company_id}\", for example, \"projects/api-test-project/tenants/foo/companies/bar\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project/companies/bar\". - `com.google.cloud.talent.v4beta1.CompanyName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CompanyServiceClient this ^com.google.cloud.talent.v4beta1.CompanyName name]
    (-> this (.deleteCompany name))))

