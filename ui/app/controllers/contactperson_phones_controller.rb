class ContactpersonPhonesController < ApplicationController
  before_action :set_contactperson_phone, only: [:show, :edit, :update, :destroy]

  # GET /contactperson_phones
  # GET /contactperson_phones.json
  def index
    @contactperson_phones = ContactpersonPhone.all
  end

  # GET /contactperson_phones/1
  # GET /contactperson_phones/1.json
  def show
  end

  # GET /contactperson_phones/new
  def new
    @contactperson_phone = ContactpersonPhone.new
  end

  # GET /contactperson_phones/1/edit
  def edit
  end

  # POST /contactperson_phones
  # POST /contactperson_phones.json
  def create
    @contactperson_phone = ContactpersonPhone.new(contactperson_phone_params)

    respond_to do |format|
      if @contactperson_phone.save
        format.html { redirect_to @contactperson_phone, notice: 'Contactperson phone was successfully created.' }
        format.json { render :show, status: :created, location: @contactperson_phone }
      else
        format.html { render :new }
        format.json { render json: @contactperson_phone.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /contactperson_phones/1
  # PATCH/PUT /contactperson_phones/1.json
  def update
    respond_to do |format|
      if @contactperson_phone.update(contactperson_phone_params)
        format.html { redirect_to @contactperson_phone, notice: 'Contactperson phone was successfully updated.' }
        format.json { render :show, status: :ok, location: @contactperson_phone }
      else
        format.html { render :edit }
        format.json { render json: @contactperson_phone.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /contactperson_phones/1
  # DELETE /contactperson_phones/1.json
  def destroy
    @contactperson_phone.destroy
    respond_to do |format|
      format.html { redirect_to contactperson_phones_url, notice: 'Contactperson phone was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_contactperson_phone
      @contactperson_phone = ContactpersonPhone.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def contactperson_phone_params
      params.require(:contactperson_phone).permit(:contactperson_id, :phone_id)
    end
end
