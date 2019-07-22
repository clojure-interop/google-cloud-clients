(ns com.google.cloud.talent.v4beta1.JobServiceClient
  "Service Description: A service handles job management, including job CRUD, enumeration and
  search.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
    TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
    Job job = Job.newBuilder().build();
    Job response = jobServiceClient.createJob(parent, job);
  }

  Note: close() needs to be called on the jobServiceClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of JobServiceSettings to
  create(). For example:

  To customize credentials:



  JobServiceSettings jobServiceSettings =
      JobServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  JobServiceClient jobServiceClient =
      JobServiceClient.create(jobServiceSettings);

  To customize the endpoint:



  JobServiceSettings jobServiceSettings =
      JobServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  JobServiceClient jobServiceClient =
      JobServiceClient.create(jobServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 JobServiceClient]))

(defn *create
  "Constructs an instance of JobServiceClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.JobServiceSettings`

  returns: `com.google.cloud.talent.v4beta1.JobServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.JobServiceClient [^com.google.cloud.talent.v4beta1.JobServiceSettings settings]
    (JobServiceClient/create settings))
  (^com.google.cloud.talent.v4beta1.JobServiceClient []
    (JobServiceClient/create )))

(defn search-jobs
  "Searches for jobs using the provided
   [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].

   This call constrains the [visibility][google.cloud.talent.v4beta1.Job.visibility] of jobs
   present in the database, and only returns jobs that the caller has permission to search
   against.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchJobsRequest request = SearchJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     for (SearchJobsResponse.MatchingJob element : jobServiceClient.searchJobs(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.talent.v4beta1.SearchJobsRequest`

  returns: `com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse [^JobServiceClient this ^com.google.cloud.talent.v4beta1.SearchJobsRequest request]
    (-> this (.searchJobs request))))

(defn batch-update-jobs-callable
  "Begins executing a batch update jobs operation.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     String formattedParent = TenantName.format(\"[PROJECT]\", \"[TENANT]\");
     List<Job> jobs = new ArrayList<>();
     BatchUpdateJobsRequest request = BatchUpdateJobsRequest.newBuilder()
       .setParent(formattedParent)
       .addAllJobs(jobs)
       .build();
     ApiFuture<Operation> future = jobServiceClient.batchUpdateJobsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.batchUpdateJobsCallable))))

(defn search-jobs-paged-callable
  "Searches for jobs using the provided
   [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].

   This call constrains the [visibility][google.cloud.talent.v4beta1.Job.visibility] of jobs
   present in the database, and only returns jobs that the caller has permission to search
   against.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchJobsRequest request = SearchJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     ApiFuture<SearchJobsPagedResponse> future = jobServiceClient.searchJobsPagedCallable().futureCall(request);
     // Do something
     for (SearchJobsResponse.MatchingJob element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.searchJobsPagedCallable))))

(defn get-job
  "Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     JobName name = JobWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[JOBS]\");
     Job response = jobServiceClient.getJob(name);
   }

  name - Required. The resource name of the job to retrieve. The format is \"projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}\", for example, \"projects/api-test-project/tenants/foo/jobs/1234\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project/jobs/1234\". - `com.google.cloud.talent.v4beta1.JobName`

  returns: `com.google.cloud.talent.v4beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Job [^JobServiceClient this ^com.google.cloud.talent.v4beta1.JobName name]
    (-> this (.getJob name))))

(defn batch-create-jobs-callable
  "Begins executing a batch create jobs operation.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     String formattedParent = TenantName.format(\"[PROJECT]\", \"[TENANT]\");
     List<Job> jobs = new ArrayList<>();
     BatchCreateJobsRequest request = BatchCreateJobsRequest.newBuilder()
       .setParent(formattedParent)
       .addAllJobs(jobs)
       .build();
     ApiFuture<Operation> future = jobServiceClient.batchCreateJobsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.batchCreateJobsCallable))))

(defn search-jobs-for-alert
  "Searches for jobs using the provided
   [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].

   This API call is intended for the use case of targeting passive job seekers (for example,
   job seekers who have signed up to receive email alerts about potential job opportunities), and
   has different algorithmic adjustments that are targeted to passive job seekers.

   This call constrains the [visibility][google.cloud.talent.v4beta1.Job.visibility] of jobs
   present in the database, and only returns jobs the caller has permission to search against.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchJobsRequest request = SearchJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     for (SearchJobsResponse.MatchingJob element : jobServiceClient.searchJobsForAlert(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.talent.v4beta1.SearchJobsRequest`

  returns: `com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse [^JobServiceClient this ^com.google.cloud.talent.v4beta1.SearchJobsRequest request]
    (-> this (.searchJobsForAlert request))))

(defn batch-update-jobs-operation-callable
  "Begins executing a batch update jobs operation.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     String formattedParent = TenantName.format(\"[PROJECT]\", \"[TENANT]\");
     List<Job> jobs = new ArrayList<>();
     BatchUpdateJobsRequest request = BatchUpdateJobsRequest.newBuilder()
       .setParent(formattedParent)
       .addAllJobs(jobs)
       .build();
     OperationFuture<JobOperationResult, BatchOperationMetadata> future = jobServiceClient.batchUpdateJobsOperationCallable().futureCall(request);
     // Do something
     JobOperationResult response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceClient this]
    (-> this (.batchUpdateJobsOperationCallable))))

(defn update-job-callable
  "Updates specified job.

   Typically, updated contents become visible in search results within 10 seconds, but it may
   take up to 5 minutes.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     Job job = Job.newBuilder().build();
     UpdateJobRequest request = UpdateJobRequest.newBuilder()
       .setJob(job)
       .build();
     ApiFuture<Job> future = jobServiceClient.updateJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.updateJobCallable))))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.JobServiceSettings`"
  (^com.google.cloud.talent.v4beta1.JobServiceSettings [^JobServiceClient this]
    (-> this (.getSettings))))

(defn list-jobs-paged-callable
  "Lists jobs by filter.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String filter = \"\";
     ListJobsRequest request = ListJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setFilter(filter)
       .build();
     ApiFuture<ListJobsPagedResponse> future = jobServiceClient.listJobsPagedCallable().futureCall(request);
     // Do something
     for (Job element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "Lists jobs by filter.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String filter = \"\";
     ListJobsRequest request = ListJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setFilter(filter)
       .build();
     while (true) {
       ListJobsResponse response = jobServiceClient.listJobsCallable().call(request);
       for (Job element : response.getJobsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.listJobsCallable))))

(defn update-job
  "Updates specified job.

   Typically, updated contents become visible in search results within 10 seconds, but it may
   take up to 5 minutes.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     Job job = Job.newBuilder().build();
     Job response = jobServiceClient.updateJob(job);
   }

  job - Required. The Job to be updated. - `com.google.cloud.talent.v4beta1.Job`

  returns: `com.google.cloud.talent.v4beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Job [^JobServiceClient this ^com.google.cloud.talent.v4beta1.Job job]
    (-> this (.updateJob job))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.JobServiceStub`"
  ([^JobServiceClient this]
    (-> this (.getStub))))

(defn delete-job
  "Deletes the specified job.

   Typically, the job becomes unsearchable within 10 seconds, but it may take up to 5 minutes.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     JobName name = JobWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[JOBS]\");
     jobServiceClient.deleteJob(name);
   }

  name - Required. The resource name of the job to be deleted. The format is \"projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}\", for example, \"projects/api-test-project/tenants/foo/jobs/1234\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project/jobs/1234\". - `com.google.cloud.talent.v4beta1.JobName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^JobServiceClient this ^com.google.cloud.talent.v4beta1.JobName name]
    (-> this (.deleteJob name))))

(defn batch-create-jobs-async
  "Begins executing a batch create jobs operation.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     String formattedParent = TenantName.format(\"[PROJECT]\", \"[TENANT]\");
     List<Job> jobs = new ArrayList<>();
     JobOperationResult response = jobServiceClient.batchCreateJobsAsync(formattedParent, jobs).get();
   }

  parent - Required. The resource name of the tenant under which the job is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and a default tenant is created if unspecified, for example, \"projects/api-test-project\". - `java.lang.String`
  jobs - Required. The jobs to be created. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^JobServiceClient this ^java.lang.String parent ^java.util.List jobs]
    (-> this (.batchCreateJobsAsync parent jobs)))
  ([^JobServiceClient this ^com.google.cloud.talent.v4beta1.BatchCreateJobsRequest request]
    (-> this (.batchCreateJobsAsync request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^JobServiceClient this]
    (-> this (.isShutdown))))

(defn delete-job-callable
  "Deletes the specified job.

   Typically, the job becomes unsearchable within 10 seconds, but it may take up to 5 minutes.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     JobName name = JobWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[JOBS]\");
     DeleteJobRequest request = DeleteJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = jobServiceClient.deleteJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.deleteJobCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^JobServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^JobServiceClient this]
    (-> this (.shutdown))))

(defn batch-update-jobs-async
  "Begins executing a batch update jobs operation.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     String formattedParent = TenantName.format(\"[PROJECT]\", \"[TENANT]\");
     List<Job> jobs = new ArrayList<>();
     JobOperationResult response = jobServiceClient.batchUpdateJobsAsync(formattedParent, jobs).get();
   }

  parent - Required. The resource name of the tenant under which the job is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project\". - `java.lang.String`
  jobs - Required. The jobs to be updated. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^JobServiceClient this ^java.lang.String parent ^java.util.List jobs]
    (-> this (.batchUpdateJobsAsync parent jobs)))
  ([^JobServiceClient this ^com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest request]
    (-> this (.batchUpdateJobsAsync request))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^JobServiceClient this]
    (-> this (.getOperationsClient))))

(defn list-jobs
  "Lists jobs by filter.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String filter = \"\";
     for (Job element : jobServiceClient.listJobs(parent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the tenant under which the job is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.TenantOrProjectName`
  filter - Required. The filter string specifies the jobs to be enumerated. Supported operator: =, AND The fields eligible for filtering are: * `companyName` (Required) * `requisitionId` (Optional) * `status` (Optional) Available values: OPEN, EXPIRED, ALL. Defaults to OPEN if no value is specified. Sample Query: * companyName = \"projects/api-test-project/tenants/foo/companies/bar\" * companyName = \"projects/api-test-project/tenants/foo/companies/bar\" AND requisitionId = \"req-1\" * companyName = \"projects/api-test-project/tenants/foo/companies/bar\" AND status = \"EXPIRED\" - `java.lang.String`

  returns: `com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse [^JobServiceClient this ^com.google.cloud.talent.v4beta1.TenantOrProjectName parent ^java.lang.String filter]
    (-> this (.listJobs parent filter)))
  (^com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse [^JobServiceClient this ^com.google.cloud.talent.v4beta1.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn search-jobs-for-alert-callable
  "Searches for jobs using the provided
   [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].

   This API call is intended for the use case of targeting passive job seekers (for example,
   job seekers who have signed up to receive email alerts about potential job opportunities), and
   has different algorithmic adjustments that are targeted to passive job seekers.

   This call constrains the [visibility][google.cloud.talent.v4beta1.Job.visibility] of jobs
   present in the database, and only returns jobs the caller has permission to search against.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchJobsRequest request = SearchJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     while (true) {
       SearchJobsResponse response = jobServiceClient.searchJobsForAlertCallable().call(request);
       for (SearchJobsResponse.MatchingJob element : response.getMatchingJobsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.searchJobsForAlertCallable))))

(defn close
  ""
  ([^JobServiceClient this]
    (-> this (.close))))

(defn batch-create-jobs-operation-callable
  "Begins executing a batch create jobs operation.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     String formattedParent = TenantName.format(\"[PROJECT]\", \"[TENANT]\");
     List<Job> jobs = new ArrayList<>();
     BatchCreateJobsRequest request = BatchCreateJobsRequest.newBuilder()
       .setParent(formattedParent)
       .addAllJobs(jobs)
       .build();
     OperationFuture<JobOperationResult, BatchOperationMetadata> future = jobServiceClient.batchCreateJobsOperationCallable().futureCall(request);
     // Do something
     JobOperationResult response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceClient this]
    (-> this (.batchCreateJobsOperationCallable))))

(defn get-job-callable
  "Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     JobName name = JobWithTenantName.of(\"[PROJECT]\", \"[TENANT]\", \"[JOBS]\");
     GetJobRequest request = GetJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Job> future = jobServiceClient.getJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.getJobCallable))))

(defn search-jobs-callable
  "Searches for jobs using the provided
   [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].

   This call constrains the [visibility][google.cloud.talent.v4beta1.Job.visibility] of jobs
   present in the database, and only returns jobs that the caller has permission to search
   against.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchJobsRequest request = SearchJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     while (true) {
       SearchJobsResponse response = jobServiceClient.searchJobsCallable().call(request);
       for (SearchJobsResponse.MatchingJob element : response.getMatchingJobsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.searchJobsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^JobServiceClient this]
    (-> this (.isTerminated))))

(defn create-job-callable
  "Creates a new job.

   Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Job job = Job.newBuilder().build();
     CreateJobRequest request = CreateJobRequest.newBuilder()
       .setParent(parent.toString())
       .setJob(job)
       .build();
     ApiFuture<Job> future = jobServiceClient.createJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.createJobCallable))))

(defn create-job
  "Creates a new job.

   Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Job job = Job.newBuilder().build();
     Job response = jobServiceClient.createJob(parent, job);
   }

  parent - Required. The resource name of the tenant under which the job is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and a default tenant is created if unspecified, for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.TenantOrProjectName`
  job - Required. The Job to be created. - `com.google.cloud.talent.v4beta1.Job`

  returns: `com.google.cloud.talent.v4beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Job [^JobServiceClient this ^com.google.cloud.talent.v4beta1.TenantOrProjectName parent ^com.google.cloud.talent.v4beta1.Job job]
    (-> this (.createJob parent job)))
  (^com.google.cloud.talent.v4beta1.Job [^JobServiceClient this ^com.google.cloud.talent.v4beta1.CreateJobRequest request]
    (-> this (.createJob request))))

(defn shutdown-now
  ""
  ([^JobServiceClient this]
    (-> this (.shutdownNow))))

(defn search-jobs-for-alert-paged-callable
  "Searches for jobs using the provided
   [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].

   This API call is intended for the use case of targeting passive job seekers (for example,
   job seekers who have signed up to receive email alerts about potential job opportunities), and
   has different algorithmic adjustments that are targeted to passive job seekers.

   This call constrains the [visibility][google.cloud.talent.v4beta1.Job.visibility] of jobs
   present in the database, and only returns jobs the caller has permission to search against.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchJobsRequest request = SearchJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     ApiFuture<SearchJobsForAlertPagedResponse> future = jobServiceClient.searchJobsForAlertPagedCallable().futureCall(request);
     // Do something
     for (SearchJobsResponse.MatchingJob element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.searchJobsForAlertPagedCallable))))

(defn batch-delete-jobs-callable
  "Deletes a list of [Job][google.cloud.talent.v4beta1.Job]s by filter.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String filter = \"\";
     BatchDeleteJobsRequest request = BatchDeleteJobsRequest.newBuilder()
       .setParent(parent.toString())
       .setFilter(filter)
       .build();
     ApiFuture<Void> future = jobServiceClient.batchDeleteJobsCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceClient this]
    (-> this (.batchDeleteJobsCallable))))

(defn batch-delete-jobs
  "Deletes a list of [Job][google.cloud.talent.v4beta1.Job]s by filter.

   Sample code:



   try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String filter = \"\";
     jobServiceClient.batchDeleteJobs(parent, filter);
   }

  parent - Required. The resource name of the tenant under which the job is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and the default tenant is used if unspecified, for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.TenantOrProjectName`
  filter - Required. The filter string specifies the jobs to be deleted. Supported operator: =, AND The fields eligible for filtering are: * `companyName` (Required) * `requisitionId` (Required) Sample Query: companyName = \"projects/api-test-project/companies/123\" AND requisitionId = \"req-1\" - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^JobServiceClient this ^com.google.cloud.talent.v4beta1.TenantOrProjectName parent ^java.lang.String filter]
    (-> this (.batchDeleteJobs parent filter)))
  ([^JobServiceClient this ^com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest request]
    (-> this (.batchDeleteJobs request))))

