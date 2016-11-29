class ContactpersonEmailsController < ApplicationController
  before_action :set_contactperson_email, only: [:show, :edit, :update, :destroy]

  # GET /contactperson_emails
  # GET /contactperson_emails.json
  def index
    @contactperson_emails = ContactpersonEmail.all
  end

  # GET /contactperson_emails/1
  # GET /contactperson_emails/1.json
  def show
  end

  # GET /contactperson_emails/new
  def new
    @contactperson_email = ContactpersonEmail.new
  end

  # GET /contactperson_emails/1/edit
  def edit
  end

  # POST /contactperson_emails
  # POST /contactperson_emails.json
  def create
    @contactperson_email = ContactpersonEmail.new(contactperson_email_params)

    respond_to do |format|
      if @contactperson_email.save
        format.html { redirect_to @contactperson_email, notice: 'Contactperson email was successfully created.' }
        format.json { render :show, status: :created, location: @contactperson_email }
      else
        format.html { render :new }
        format.json { render json: @contactperson_email.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /contactperson_emails/1
  # PATCH/PUT /contactperson_emails/1.json
  def update
    respond_to do |format|
      if @contactperson_email.update(contactperson_email_params)
        format.html { redirect_to @contactperson_email, notice: 'Contactperson email was successfully updated.' }
        format.json { render :show, status: :ok, location: @contactperson_email }
      else
        format.html { render :edit }
        format.json { render json: @contactperson_email.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /contactperson_emails/1
  # DELETE /contactperson_emails/1.json
  def destroy
    @contactperson_email.destroy
    respond_to do |format|
      format.html { redirect_to contactperson_emails_url, notice: 'Contactperson email was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_contactperson_email
      @contactperson_email = ContactpersonEmail.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def contactperson_email_params
      params.require(:contactperson_email).permit(:contactperson_id, :email_id)
    end
end
