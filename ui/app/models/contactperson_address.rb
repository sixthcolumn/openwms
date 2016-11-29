class ContactpersonAddress < ActiveRecord::Base
  belongs_to :contactperson
  belongs_to :address
end
