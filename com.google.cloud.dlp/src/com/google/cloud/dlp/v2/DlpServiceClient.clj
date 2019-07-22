(ns com.google.cloud.dlp.v2.DlpServiceClient
  "Service Description: The Cloud Data Loss Prevention (DLP) API is a service that allows clients to
  detect the presence of Personally Identifiable Information (PII) and other privacy-sensitive data
  in user-supplied, unstructured data streams, like text blocks or images. The service also
  includes methods for sensitive data redaction and scheduling of data scans on Google Cloud
  Platform based data sets.

  To learn more about concepts and find how-to guides see https://cloud.google.com/dlp/docs/.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
    ProjectName parent = ProjectName.of(\"[PROJECT]\");
    InspectContentRequest request = InspectContentRequest.newBuilder()
      .setParent(parent.toString())
      .build();
    InspectContentResponse response = dlpServiceClient.inspectContent(request);
  }

  Note: close() needs to be called on the dlpServiceClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of DlpServiceSettings to
  create(). For example:

  To customize credentials:



  DlpServiceSettings dlpServiceSettings =
      DlpServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DlpServiceClient dlpServiceClient =
      DlpServiceClient.create(dlpServiceSettings);

  To customize the endpoint:



  DlpServiceSettings dlpServiceSettings =
      DlpServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  DlpServiceClient dlpServiceClient =
      DlpServiceClient.create(dlpServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dlp.v2 DlpServiceClient]))

(defn *create
  "Constructs an instance of DlpServiceClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dlp.v2.DlpServiceSettings`

  returns: `com.google.cloud.dlp.v2.DlpServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.dlp.v2.DlpServiceClient [^com.google.cloud.dlp.v2.DlpServiceSettings settings]
    (DlpServiceClient/create settings))
  (^com.google.cloud.dlp.v2.DlpServiceClient []
    (DlpServiceClient/create )))

(defn update-deidentify-template-callable
  "Updates the DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid
   to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DeidentifyTemplateName name = OrganizationDeidentifyTemplateName.of(\"[ORGANIZATION]\", \"[DEIDENTIFY_TEMPLATE]\");
     UpdateDeidentifyTemplateRequest request = UpdateDeidentifyTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<DeidentifyTemplate> future = dlpServiceClient.updateDeidentifyTemplateCallable().futureCall(request);
     // Do something
     DeidentifyTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.updateDeidentifyTemplateCallable))))

(defn cancel-dlp-job-callable
  "Starts asynchronous cancellation on a long-running DlpJob. The server makes a best effort to
   cancel the DlpJob, but success is not guaranteed. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DlpJobName name = DlpJobName.of(\"[PROJECT]\", \"[DLP_JOB]\");
     CancelDlpJobRequest request = CancelDlpJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dlpServiceClient.cancelDlpJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CancelDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.cancelDlpJobCallable))))

(defn redact-image
  "Redacts potentially sensitive info from an image. This method has limits on input size,
   processing time, and output size. See
   https://cloud.google.com/dlp/docs/redacting-sensitive-data-images to learn more.

   When no InfoTypes or CustomInfoTypes are specified in this request, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     RedactImageRequest request = RedactImageRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     RedactImageResponse response = dlpServiceClient.redactImage(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.RedactImageRequest`

  returns: `com.google.privacy.dlp.v2.RedactImageResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.RedactImageResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.RedactImageRequest request]
    (-> this (.redactImage request))))

(defn list-job-triggers
  "Lists job triggers. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListJobTriggersRequest request = ListJobTriggersRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (JobTrigger element : dlpServiceClient.listJobTriggers(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ListJobTriggersRequest`

  returns: `com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ListJobTriggersRequest request]
    (-> this (.listJobTriggers request))))

(defn update-job-trigger
  "Updates a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectJobTriggerName name = ProjectJobTriggerName.of(\"[PROJECT]\", \"[JOB_TRIGGER]\");
     UpdateJobTriggerRequest request = UpdateJobTriggerRequest.newBuilder()
       .setName(name.toString())
       .build();
     JobTrigger response = dlpServiceClient.updateJobTrigger(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.UpdateJobTriggerRequest`

  returns: `com.google.privacy.dlp.v2.JobTrigger`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.JobTrigger [^DlpServiceClient this ^com.google.privacy.dlp.v2.UpdateJobTriggerRequest request]
    (-> this (.updateJobTrigger request))))

(defn get-job-trigger
  "Gets a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectJobTriggerName name = ProjectJobTriggerName.of(\"[PROJECT]\", \"[JOB_TRIGGER]\");
     GetJobTriggerRequest request = GetJobTriggerRequest.newBuilder()
       .setName(name.toString())
       .build();
     JobTrigger response = dlpServiceClient.getJobTrigger(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.GetJobTriggerRequest`

  returns: `com.google.privacy.dlp.v2.JobTrigger`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.JobTrigger [^DlpServiceClient this ^com.google.privacy.dlp.v2.GetJobTriggerRequest request]
    (-> this (.getJobTrigger request))))

(defn update-job-trigger-callable
  "Updates a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectJobTriggerName name = ProjectJobTriggerName.of(\"[PROJECT]\", \"[JOB_TRIGGER]\");
     UpdateJobTriggerRequest request = UpdateJobTriggerRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<JobTrigger> future = dlpServiceClient.updateJobTriggerCallable().futureCall(request);
     // Do something
     JobTrigger response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.updateJobTriggerCallable))))

(defn delete-inspect-template-callable
  "Deletes an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     InspectTemplateName name = OrganizationInspectTemplateName.of(\"[ORGANIZATION]\", \"[INSPECT_TEMPLATE]\");
     DeleteInspectTemplateRequest request = DeleteInspectTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dlpServiceClient.deleteInspectTemplateCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteInspectTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.deleteInspectTemplateCallable))))

(defn create-job-trigger-callable
  "Creates a job trigger to run DLP actions such as scanning storage for sensitive information on
   a set schedule. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     CreateJobTriggerRequest request = CreateJobTriggerRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<JobTrigger> future = dlpServiceClient.createJobTriggerCallable().futureCall(request);
     // Do something
     JobTrigger response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.createJobTriggerCallable))))

(defn get-inspect-template
  "Gets an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     GetInspectTemplateRequest request = GetInspectTemplateRequest.newBuilder().build();
     InspectTemplate response = dlpServiceClient.getInspectTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.GetInspectTemplateRequest`

  returns: `com.google.privacy.dlp.v2.InspectTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.InspectTemplate [^DlpServiceClient this ^com.google.privacy.dlp.v2.GetInspectTemplateRequest request]
    (-> this (.getInspectTemplate request))))

(defn cancel-dlp-job
  "Starts asynchronous cancellation on a long-running DlpJob. The server makes a best effort to
   cancel the DlpJob, but success is not guaranteed. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DlpJobName name = DlpJobName.of(\"[PROJECT]\", \"[DLP_JOB]\");
     CancelDlpJobRequest request = CancelDlpJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     dlpServiceClient.cancelDlpJob(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.CancelDlpJobRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DlpServiceClient this ^com.google.privacy.dlp.v2.CancelDlpJobRequest request]
    (-> this (.cancelDlpJob request))))

(defn delete-dlp-job
  "Deletes a long-running DlpJob. This method indicates that the client is no longer interested in
   the DlpJob result. The job will be cancelled if possible. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DlpJobName name = DlpJobName.of(\"[PROJECT]\", \"[DLP_JOB]\");
     DeleteDlpJobRequest request = DeleteDlpJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     dlpServiceClient.deleteDlpJob(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.DeleteDlpJobRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DlpServiceClient this ^com.google.privacy.dlp.v2.DeleteDlpJobRequest request]
    (-> this (.deleteDlpJob request))))

(defn delete-deidentify-template-callable
  "Deletes a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DeidentifyTemplateName name = OrganizationDeidentifyTemplateName.of(\"[ORGANIZATION]\", \"[DEIDENTIFY_TEMPLATE]\");
     DeleteDeidentifyTemplateRequest request = DeleteDeidentifyTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dlpServiceClient.deleteDeidentifyTemplateCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.deleteDeidentifyTemplateCallable))))

(defn create-deidentify-template
  "Creates a DeidentifyTemplate for re-using frequently used configuration for de-identifying
   content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     CreateDeidentifyTemplateRequest request = CreateDeidentifyTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     DeidentifyTemplate response = dlpServiceClient.createDeidentifyTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest`

  returns: `com.google.privacy.dlp.v2.DeidentifyTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.DeidentifyTemplate [^DlpServiceClient this ^com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest request]
    (-> this (.createDeidentifyTemplate request))))

(defn create-deidentify-template-callable
  "Creates a DeidentifyTemplate for re-using frequently used configuration for de-identifying
   content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     CreateDeidentifyTemplateRequest request = CreateDeidentifyTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<DeidentifyTemplate> future = dlpServiceClient.createDeidentifyTemplateCallable().futureCall(request);
     // Do something
     DeidentifyTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.createDeidentifyTemplateCallable))))

(defn inspect-content-callable
  "Finds potentially sensitive info in content. This method has limits on input size, processing
   time, and output size.

   When no InfoTypes or CustomInfoTypes are specified in this request, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   For how to guides, see https://cloud.google.com/dlp/docs/inspecting-images and
   https://cloud.google.com/dlp/docs/inspecting-text,

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     InspectContentRequest request = InspectContentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<InspectContentResponse> future = dlpServiceClient.inspectContentCallable().futureCall(request);
     // Do something
     InspectContentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.InspectContentRequest,com.google.privacy.dlp.v2.InspectContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.inspectContentCallable))))

(defn delete-job-trigger
  "Deletes a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectJobTriggerName name = ProjectJobTriggerName.of(\"[PROJECT]\", \"[JOB_TRIGGER]\");
     DeleteJobTriggerRequest request = DeleteJobTriggerRequest.newBuilder()
       .setName(name.toString())
       .build();
     dlpServiceClient.deleteJobTrigger(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.DeleteJobTriggerRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DlpServiceClient this ^com.google.privacy.dlp.v2.DeleteJobTriggerRequest request]
    (-> this (.deleteJobTrigger request))))

(defn get-settings
  "returns: `com.google.cloud.dlp.v2.DlpServiceSettings`"
  (^com.google.cloud.dlp.v2.DlpServiceSettings [^DlpServiceClient this]
    (-> this (.getSettings))))

(defn list-info-types-callable
  "Returns a list of the sensitive information types that the DLP API supports. See
   https://cloud.google.com/dlp/docs/infotypes-reference to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ListInfoTypesRequest request = ListInfoTypesRequest.newBuilder().build();
     ApiFuture<ListInfoTypesResponse> future = dlpServiceClient.listInfoTypesCallable().futureCall(request);
     // Do something
     ListInfoTypesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListInfoTypesRequest,com.google.privacy.dlp.v2.ListInfoTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listInfoTypesCallable))))

(defn get-job-trigger-callable
  "Gets a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectJobTriggerName name = ProjectJobTriggerName.of(\"[PROJECT]\", \"[JOB_TRIGGER]\");
     GetJobTriggerRequest request = GetJobTriggerRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<JobTrigger> future = dlpServiceClient.getJobTriggerCallable().futureCall(request);
     // Do something
     JobTrigger response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.getJobTriggerCallable))))

(defn create-job-trigger
  "Creates a job trigger to run DLP actions such as scanning storage for sensitive information on
   a set schedule. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     CreateJobTriggerRequest request = CreateJobTriggerRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     JobTrigger response = dlpServiceClient.createJobTrigger(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.CreateJobTriggerRequest`

  returns: `com.google.privacy.dlp.v2.JobTrigger`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.JobTrigger [^DlpServiceClient this ^com.google.privacy.dlp.v2.CreateJobTriggerRequest request]
    (-> this (.createJobTrigger request))))

(defn list-deidentify-templates-callable
  "Lists DeidentifyTemplates. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListDeidentifyTemplatesRequest request = ListDeidentifyTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDeidentifyTemplatesResponse response = dlpServiceClient.listDeidentifyTemplatesCallable().call(request);
       for (DeidentifyTemplate element : response.getDeidentifyTemplatesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest,com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listDeidentifyTemplatesCallable))))

(defn inspect-content
  "Finds potentially sensitive info in content. This method has limits on input size, processing
   time, and output size.

   When no InfoTypes or CustomInfoTypes are specified in this request, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   For how to guides, see https://cloud.google.com/dlp/docs/inspecting-images and
   https://cloud.google.com/dlp/docs/inspecting-text,

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     InspectContentRequest request = InspectContentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     InspectContentResponse response = dlpServiceClient.inspectContent(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.InspectContentRequest`

  returns: `com.google.privacy.dlp.v2.InspectContentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.InspectContentResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.InspectContentRequest request]
    (-> this (.inspectContent request))))

(defn delete-dlp-job-callable
  "Deletes a long-running DlpJob. This method indicates that the client is no longer interested in
   the DlpJob result. The job will be cancelled if possible. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DlpJobName name = DlpJobName.of(\"[PROJECT]\", \"[DLP_JOB]\");
     DeleteDlpJobRequest request = DeleteDlpJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dlpServiceClient.deleteDlpJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.deleteDlpJobCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dlp.v2.stub.DlpServiceStub`"
  ([^DlpServiceClient this]
    (-> this (.getStub))))

(defn list-dlp-jobs-callable
  "Lists DlpJobs that match the specified filter in the request. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListDlpJobsRequest request = ListDlpJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDlpJobsResponse response = dlpServiceClient.listDlpJobsCallable().call(request);
       for (DlpJob element : response.getJobsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDlpJobsRequest,com.google.privacy.dlp.v2.ListDlpJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listDlpJobsCallable))))

(defn delete-deidentify-template
  "Deletes a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DeidentifyTemplateName name = OrganizationDeidentifyTemplateName.of(\"[ORGANIZATION]\", \"[DEIDENTIFY_TEMPLATE]\");
     DeleteDeidentifyTemplateRequest request = DeleteDeidentifyTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     dlpServiceClient.deleteDeidentifyTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DlpServiceClient this ^com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest request]
    (-> this (.deleteDeidentifyTemplate request))))

(defn delete-stored-info-type-callable
  "Deletes a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     StoredInfoTypeName name = OrganizationStoredInfoTypeName.of(\"[ORGANIZATION]\", \"[STORED_INFO_TYPE]\");
     DeleteStoredInfoTypeRequest request = DeleteStoredInfoTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dlpServiceClient.deleteStoredInfoTypeCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.deleteStoredInfoTypeCallable))))

(defn reidentify-content
  "Re-identifies content that has been de-identified. See
   https://cloud.google.com/dlp/docs/pseudonymization#re-identification_in_free_text_code_example
   to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ReidentifyContentRequest request = ReidentifyContentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ReidentifyContentResponse response = dlpServiceClient.reidentifyContent(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ReidentifyContentRequest`

  returns: `com.google.privacy.dlp.v2.ReidentifyContentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.ReidentifyContentResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ReidentifyContentRequest request]
    (-> this (.reidentifyContent request))))

(defn reidentify-content-callable
  "Re-identifies content that has been de-identified. See
   https://cloud.google.com/dlp/docs/pseudonymization#re-identification_in_free_text_code_example
   to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ReidentifyContentRequest request = ReidentifyContentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ReidentifyContentResponse> future = dlpServiceClient.reidentifyContentCallable().futureCall(request);
     // Do something
     ReidentifyContentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ReidentifyContentRequest,com.google.privacy.dlp.v2.ReidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.reidentifyContentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DlpServiceClient this]
    (-> this (.isShutdown))))

(defn delete-job-trigger-callable
  "Deletes a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectJobTriggerName name = ProjectJobTriggerName.of(\"[PROJECT]\", \"[JOB_TRIGGER]\");
     DeleteJobTriggerRequest request = DeleteJobTriggerRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dlpServiceClient.deleteJobTriggerCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteJobTriggerRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.deleteJobTriggerCallable))))

(defn create-dlp-job-callable
  "Creates a new job to inspect storage or calculate risk metrics. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     CreateDlpJobRequest request = CreateDlpJobRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<DlpJob> future = dlpServiceClient.createDlpJobCallable().futureCall(request);
     // Do something
     DlpJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.createDlpJobCallable))))

(defn list-stored-info-types
  "Lists stored infoTypes. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListStoredInfoTypesRequest request = ListStoredInfoTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (StoredInfoType element : dlpServiceClient.listStoredInfoTypes(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ListStoredInfoTypesRequest`

  returns: `com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ListStoredInfoTypesRequest request]
    (-> this (.listStoredInfoTypes request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DlpServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-inspect-template-callable
  "Gets an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     GetInspectTemplateRequest request = GetInspectTemplateRequest.newBuilder().build();
     ApiFuture<InspectTemplate> future = dlpServiceClient.getInspectTemplateCallable().futureCall(request);
     // Do something
     InspectTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.getInspectTemplateCallable))))

(defn shutdown
  ""
  ([^DlpServiceClient this]
    (-> this (.shutdown))))

(defn deidentify-content
  "De-identifies potentially sensitive info from a ContentItem. This method has limits on input
   size and output size. See https://cloud.google.com/dlp/docs/deidentify-sensitive-data to learn
   more.

   When no InfoTypes or CustomInfoTypes are specified in this request, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     DeidentifyContentRequest request = DeidentifyContentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     DeidentifyContentResponse response = dlpServiceClient.deidentifyContent(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.DeidentifyContentRequest`

  returns: `com.google.privacy.dlp.v2.DeidentifyContentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.DeidentifyContentResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.DeidentifyContentRequest request]
    (-> this (.deidentifyContent request))))

(defn update-inspect-template-callable
  "Updates the InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     InspectTemplateName name = OrganizationInspectTemplateName.of(\"[ORGANIZATION]\", \"[INSPECT_TEMPLATE]\");
     UpdateInspectTemplateRequest request = UpdateInspectTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<InspectTemplate> future = dlpServiceClient.updateInspectTemplateCallable().futureCall(request);
     // Do something
     InspectTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.updateInspectTemplateCallable))))

(defn deidentify-content-callable
  "De-identifies potentially sensitive info from a ContentItem. This method has limits on input
   size and output size. See https://cloud.google.com/dlp/docs/deidentify-sensitive-data to learn
   more.

   When no InfoTypes or CustomInfoTypes are specified in this request, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     DeidentifyContentRequest request = DeidentifyContentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<DeidentifyContentResponse> future = dlpServiceClient.deidentifyContentCallable().futureCall(request);
     // Do something
     DeidentifyContentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeidentifyContentRequest,com.google.privacy.dlp.v2.DeidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.deidentifyContentCallable))))

(defn create-inspect-template-callable
  "Creates an InspectTemplate for re-using frequently used configuration for inspecting content,
   images, and storage. See https://cloud.google.com/dlp/docs/creating-templates to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     CreateInspectTemplateRequest request = CreateInspectTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<InspectTemplate> future = dlpServiceClient.createInspectTemplateCallable().futureCall(request);
     // Do something
     InspectTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.createInspectTemplateCallable))))

(defn delete-inspect-template
  "Deletes an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     InspectTemplateName name = OrganizationInspectTemplateName.of(\"[ORGANIZATION]\", \"[INSPECT_TEMPLATE]\");
     DeleteInspectTemplateRequest request = DeleteInspectTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     dlpServiceClient.deleteInspectTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.DeleteInspectTemplateRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DlpServiceClient this ^com.google.privacy.dlp.v2.DeleteInspectTemplateRequest request]
    (-> this (.deleteInspectTemplate request))))

(defn list-deidentify-templates
  "Lists DeidentifyTemplates. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListDeidentifyTemplatesRequest request = ListDeidentifyTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (DeidentifyTemplate element : dlpServiceClient.listDeidentifyTemplates(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest`

  returns: `com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest request]
    (-> this (.listDeidentifyTemplates request))))

(defn list-inspect-templates
  "Lists InspectTemplates. See https://cloud.google.com/dlp/docs/creating-templates to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListInspectTemplatesRequest request = ListInspectTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (InspectTemplate element : dlpServiceClient.listInspectTemplates(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ListInspectTemplatesRequest`

  returns: `com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ListInspectTemplatesRequest request]
    (-> this (.listInspectTemplates request))))

(defn create-dlp-job
  "Creates a new job to inspect storage or calculate risk metrics. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     CreateDlpJobRequest request = CreateDlpJobRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     DlpJob response = dlpServiceClient.createDlpJob(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.CreateDlpJobRequest`

  returns: `com.google.privacy.dlp.v2.DlpJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.DlpJob [^DlpServiceClient this ^com.google.privacy.dlp.v2.CreateDlpJobRequest request]
    (-> this (.createDlpJob request))))

(defn get-deidentify-template
  "Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DeidentifyTemplateName name = OrganizationDeidentifyTemplateName.of(\"[ORGANIZATION]\", \"[DEIDENTIFY_TEMPLATE]\");
     GetDeidentifyTemplateRequest request = GetDeidentifyTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     DeidentifyTemplate response = dlpServiceClient.getDeidentifyTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest`

  returns: `com.google.privacy.dlp.v2.DeidentifyTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.DeidentifyTemplate [^DlpServiceClient this ^com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest request]
    (-> this (.getDeidentifyTemplate request))))

(defn close
  ""
  ([^DlpServiceClient this]
    (-> this (.close))))

(defn list-dlp-jobs-paged-callable
  "Lists DlpJobs that match the specified filter in the request. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListDlpJobsRequest request = ListDlpJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDlpJobsPagedResponse> future = dlpServiceClient.listDlpJobsPagedCallable().futureCall(request);
     // Do something
     for (DlpJob element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDlpJobsRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listDlpJobsPagedCallable))))

(defn get-dlp-job-callable
  "Gets the latest state of a long-running DlpJob. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DlpJobName name = DlpJobName.of(\"[PROJECT]\", \"[DLP_JOB]\");
     GetDlpJobRequest request = GetDlpJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<DlpJob> future = dlpServiceClient.getDlpJobCallable().futureCall(request);
     // Do something
     DlpJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.getDlpJobCallable))))

(defn list-job-triggers-callable
  "Lists job triggers. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListJobTriggersRequest request = ListJobTriggersRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListJobTriggersResponse response = dlpServiceClient.listJobTriggersCallable().call(request);
       for (JobTrigger element : response.getJobTriggersList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListJobTriggersRequest,com.google.privacy.dlp.v2.ListJobTriggersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listJobTriggersCallable))))

(defn get-dlp-job
  "Gets the latest state of a long-running DlpJob. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DlpJobName name = DlpJobName.of(\"[PROJECT]\", \"[DLP_JOB]\");
     GetDlpJobRequest request = GetDlpJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     DlpJob response = dlpServiceClient.getDlpJob(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.GetDlpJobRequest`

  returns: `com.google.privacy.dlp.v2.DlpJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.DlpJob [^DlpServiceClient this ^com.google.privacy.dlp.v2.GetDlpJobRequest request]
    (-> this (.getDlpJob request))))

(defn update-deidentify-template
  "Updates the DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid
   to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DeidentifyTemplateName name = OrganizationDeidentifyTemplateName.of(\"[ORGANIZATION]\", \"[DEIDENTIFY_TEMPLATE]\");
     UpdateDeidentifyTemplateRequest request = UpdateDeidentifyTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     DeidentifyTemplate response = dlpServiceClient.updateDeidentifyTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest`

  returns: `com.google.privacy.dlp.v2.DeidentifyTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.DeidentifyTemplate [^DlpServiceClient this ^com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest request]
    (-> this (.updateDeidentifyTemplate request))))

(defn update-stored-info-type
  "Updates the stored infoType by creating a new version. The existing version will continue to be
   used until the new version is ready. See
   https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     StoredInfoTypeName name = OrganizationStoredInfoTypeName.of(\"[ORGANIZATION]\", \"[STORED_INFO_TYPE]\");
     UpdateStoredInfoTypeRequest request = UpdateStoredInfoTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     StoredInfoType response = dlpServiceClient.updateStoredInfoType(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest`

  returns: `com.google.privacy.dlp.v2.StoredInfoType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.StoredInfoType [^DlpServiceClient this ^com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest request]
    (-> this (.updateStoredInfoType request))))

(defn list-info-types
  "Returns a list of the sensitive information types that the DLP API supports. See
   https://cloud.google.com/dlp/docs/infotypes-reference to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ListInfoTypesRequest request = ListInfoTypesRequest.newBuilder().build();
     ListInfoTypesResponse response = dlpServiceClient.listInfoTypes(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ListInfoTypesRequest`

  returns: `com.google.privacy.dlp.v2.ListInfoTypesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.ListInfoTypesResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ListInfoTypesRequest request]
    (-> this (.listInfoTypes request))))

(defn update-stored-info-type-callable
  "Updates the stored infoType by creating a new version. The existing version will continue to be
   used until the new version is ready. See
   https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     StoredInfoTypeName name = OrganizationStoredInfoTypeName.of(\"[ORGANIZATION]\", \"[STORED_INFO_TYPE]\");
     UpdateStoredInfoTypeRequest request = UpdateStoredInfoTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<StoredInfoType> future = dlpServiceClient.updateStoredInfoTypeCallable().futureCall(request);
     // Do something
     StoredInfoType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.updateStoredInfoTypeCallable))))

(defn create-stored-info-type-callable
  "Creates a pre-built stored infoType to be used for inspection. See
   https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     CreateStoredInfoTypeRequest request = CreateStoredInfoTypeRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<StoredInfoType> future = dlpServiceClient.createStoredInfoTypeCallable().futureCall(request);
     // Do something
     StoredInfoType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.createStoredInfoTypeCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DlpServiceClient this]
    (-> this (.isTerminated))))

(defn get-stored-info-type
  "Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     StoredInfoTypeName name = OrganizationStoredInfoTypeName.of(\"[ORGANIZATION]\", \"[STORED_INFO_TYPE]\");
     GetStoredInfoTypeRequest request = GetStoredInfoTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     StoredInfoType response = dlpServiceClient.getStoredInfoType(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.GetStoredInfoTypeRequest`

  returns: `com.google.privacy.dlp.v2.StoredInfoType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.StoredInfoType [^DlpServiceClient this ^com.google.privacy.dlp.v2.GetStoredInfoTypeRequest request]
    (-> this (.getStoredInfoType request))))

(defn list-stored-info-types-paged-callable
  "Lists stored infoTypes. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListStoredInfoTypesRequest request = ListStoredInfoTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListStoredInfoTypesPagedResponse> future = dlpServiceClient.listStoredInfoTypesPagedCallable().futureCall(request);
     // Do something
     for (StoredInfoType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListStoredInfoTypesRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listStoredInfoTypesPagedCallable))))

(defn get-stored-info-type-callable
  "Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     StoredInfoTypeName name = OrganizationStoredInfoTypeName.of(\"[ORGANIZATION]\", \"[STORED_INFO_TYPE]\");
     GetStoredInfoTypeRequest request = GetStoredInfoTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<StoredInfoType> future = dlpServiceClient.getStoredInfoTypeCallable().futureCall(request);
     // Do something
     StoredInfoType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.getStoredInfoTypeCallable))))

(defn create-stored-info-type
  "Creates a pre-built stored infoType to be used for inspection. See
   https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     CreateStoredInfoTypeRequest request = CreateStoredInfoTypeRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     StoredInfoType response = dlpServiceClient.createStoredInfoType(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest`

  returns: `com.google.privacy.dlp.v2.StoredInfoType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.StoredInfoType [^DlpServiceClient this ^com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest request]
    (-> this (.createStoredInfoType request))))

(defn list-stored-info-types-callable
  "Lists stored infoTypes. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListStoredInfoTypesRequest request = ListStoredInfoTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListStoredInfoTypesResponse response = dlpServiceClient.listStoredInfoTypesCallable().call(request);
       for (StoredInfoType element : response.getStoredInfoTypesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListStoredInfoTypesRequest,com.google.privacy.dlp.v2.ListStoredInfoTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listStoredInfoTypesCallable))))

(defn delete-stored-info-type
  "Deletes a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     StoredInfoTypeName name = OrganizationStoredInfoTypeName.of(\"[ORGANIZATION]\", \"[STORED_INFO_TYPE]\");
     DeleteStoredInfoTypeRequest request = DeleteStoredInfoTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     dlpServiceClient.deleteStoredInfoType(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DlpServiceClient this ^com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest request]
    (-> this (.deleteStoredInfoType request))))

(defn list-dlp-jobs
  "Lists DlpJobs that match the specified filter in the request. See
   https://cloud.google.com/dlp/docs/inspecting-storage and
   https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListDlpJobsRequest request = ListDlpJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (DlpJob element : dlpServiceClient.listDlpJobs(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.ListDlpJobsRequest`

  returns: `com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse [^DlpServiceClient this ^com.google.privacy.dlp.v2.ListDlpJobsRequest request]
    (-> this (.listDlpJobs request))))

(defn list-inspect-templates-callable
  "Lists InspectTemplates. See https://cloud.google.com/dlp/docs/creating-templates to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListInspectTemplatesRequest request = ListInspectTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListInspectTemplatesResponse response = dlpServiceClient.listInspectTemplatesCallable().call(request);
       for (InspectTemplate element : response.getInspectTemplatesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListInspectTemplatesRequest,com.google.privacy.dlp.v2.ListInspectTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listInspectTemplatesCallable))))

(defn shutdown-now
  ""
  ([^DlpServiceClient this]
    (-> this (.shutdownNow))))

(defn list-inspect-templates-paged-callable
  "Lists InspectTemplates. See https://cloud.google.com/dlp/docs/creating-templates to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListInspectTemplatesRequest request = ListInspectTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListInspectTemplatesPagedResponse> future = dlpServiceClient.listInspectTemplatesPagedCallable().futureCall(request);
     // Do something
     for (InspectTemplate element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListInspectTemplatesRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listInspectTemplatesPagedCallable))))

(defn get-deidentify-template-callable
  "Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     DeidentifyTemplateName name = OrganizationDeidentifyTemplateName.of(\"[ORGANIZATION]\", \"[DEIDENTIFY_TEMPLATE]\");
     GetDeidentifyTemplateRequest request = GetDeidentifyTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<DeidentifyTemplate> future = dlpServiceClient.getDeidentifyTemplateCallable().futureCall(request);
     // Do something
     DeidentifyTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.getDeidentifyTemplateCallable))))

(defn list-deidentify-templates-paged-callable
  "Lists DeidentifyTemplates. See https://cloud.google.com/dlp/docs/creating-templates-deid to
   learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListDeidentifyTemplatesRequest request = ListDeidentifyTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDeidentifyTemplatesPagedResponse> future = dlpServiceClient.listDeidentifyTemplatesPagedCallable().futureCall(request);
     // Do something
     for (DeidentifyTemplate element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listDeidentifyTemplatesPagedCallable))))

(defn create-inspect-template
  "Creates an InspectTemplate for re-using frequently used configuration for inspecting content,
   images, and storage. See https://cloud.google.com/dlp/docs/creating-templates to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     CreateInspectTemplateRequest request = CreateInspectTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     InspectTemplate response = dlpServiceClient.createInspectTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.CreateInspectTemplateRequest`

  returns: `com.google.privacy.dlp.v2.InspectTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.InspectTemplate [^DlpServiceClient this ^com.google.privacy.dlp.v2.CreateInspectTemplateRequest request]
    (-> this (.createInspectTemplate request))))

(defn redact-image-callable
  "Redacts potentially sensitive info from an image. This method has limits on input size,
   processing time, and output size. See
   https://cloud.google.com/dlp/docs/redacting-sensitive-data-images to learn more.

   When no InfoTypes or CustomInfoTypes are specified in this request, the system will
   automatically choose what detectors to run. By default this may be all types, but may change
   over time as detectors are updated.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     RedactImageRequest request = RedactImageRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<RedactImageResponse> future = dlpServiceClient.redactImageCallable().futureCall(request);
     // Do something
     RedactImageResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.RedactImageRequest,com.google.privacy.dlp.v2.RedactImageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.redactImageCallable))))

(defn list-job-triggers-paged-callable
  "Lists job triggers. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListJobTriggersRequest request = ListJobTriggersRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListJobTriggersPagedResponse> future = dlpServiceClient.listJobTriggersPagedCallable().futureCall(request);
     // Do something
     for (JobTrigger element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListJobTriggersRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceClient this]
    (-> this (.listJobTriggersPagedCallable))))

(defn update-inspect-template
  "Updates the InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn
   more.

   Sample code:



   try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
     InspectTemplateName name = OrganizationInspectTemplateName.of(\"[ORGANIZATION]\", \"[INSPECT_TEMPLATE]\");
     UpdateInspectTemplateRequest request = UpdateInspectTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     InspectTemplate response = dlpServiceClient.updateInspectTemplate(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.privacy.dlp.v2.UpdateInspectTemplateRequest`

  returns: `com.google.privacy.dlp.v2.InspectTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.privacy.dlp.v2.InspectTemplate [^DlpServiceClient this ^com.google.privacy.dlp.v2.UpdateInspectTemplateRequest request]
    (-> this (.updateInspectTemplate request))))

