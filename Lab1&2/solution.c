#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<time.h>






typedef struct date{
	int dd;
	int mm;
	int yyyy;
	}dob;

typedef struct doctor{
	char name[20],email[20];
	
	char doctor_id[20];
	char password[20];
	}doctor;

typedef struct patient{
	char name[20],email[20];
	dob patient_dob;
	
	char patient_id[20];
	char password[20];
}patient;

typedef struct sensor{
	int temp;//temperature
	int bp;//blood-pressure
	int heart_rate;//heart_beat
}sensor;


void reg();
void login();
void patient_operation();

double randfrom(double min,double max);
void index_page();


void patient_operation(){
	int patient_option;
	printf("1.View health status2.List of all registered doctor\n3.Ask doctor(s) to consult\n4.Log-out");
	switch(patient_option){
		case 1:
		break;
		case 2:
		break;
		case 3:
		break;
		case 4:
		default:{printf("Invalid selection.....\n\t\tPlease try again.\n");
						}
				}
			}
			
doctor_operation(){
	int doctor_option;
	printf("1.List of registered patient\n2.Monitor health status of registered patient\n3.Ask patient(s) to consult\n4.log out\n");
	switch(doctor_option){
		case 1:
		break;
		case 2:
		break;
		case 3:
		break;
		case 4:
		default:{printf("Invalid selection.....\n\t\tPlease try again.\n");
						}
				}


}		

void getAge(dob day,dob month,dob year){
	time_t now = time(NULL);
	struct tm *t = localtime(&now);
	
	dob current_day,current_month,current_year;
	current_day.dd = t->tm_mon+1;
	current_month.mm = t->tm_mday;
	current_year.yyyy = t->tm_year+1900;
	
	//dob dob_day.dd=day,dob_month.mm=month,dob_year.yyyy=year;
	dob dob_day,dob_month,dob_year;
	
	
	year.yyyy = current_year.yyyy - dob_year.yyyy;
	month.mm = current_month.mm - dob_month.mm;
	day.dd = current_day.dd - dob_day.dd;
	
	if((current_month.mm < dob_month.mm)||((dob_month.mm==current_month.mm)&&(current_day.dd < dob_day.dd))){
		year.yyyy = year.yyyy - 1;
			}
		month.mm = (12 - dob_month.mm) + current_month.mm;
	if(current_day.dd < dob_day.dd){
		day.dd = day.dd - 1;
			}
		//print age of person

	printf("Current age of patient is:%d day %d month %d years on %d %d %d ",day,month,year,current_day.dd,current_month.mm,current_year.yyyy);

	}


//get random data

double randfrom(double min,double max){
		double range = (max - min);
		double div = RAND_MAX / range;
		return min + (rand() / div);
		}





void patienthealth_satus(){
	
		
	//double heart_rate = randfrom(50.0,130);
	
	//double systolic = randfrom(80.0,170);
	//double diastolic = randfrom(50.0,100.0);
	
	printf("Temperature of body:%.2lf degree fahrenheit\n",randfrom(92.0,104.0));
	/*
	if(btemp>100.0){
		printf("You have fever ,Need checkup.\n");
	}
	
	else if(btemp<96.0){
		printf("Your body temperature is Quite low.\n");
		printf("Take appoint and schedule check-up");
	}
	
	else
		{
			printf("Your body temperature is Normal\n");
		}
		*/
	
	printf("Heart rate of patient:%.0lf bpm\n",randfrom(50.0,130));
	/*
	if(heart_rate < 60){
		printf("If you are not sleeping,Your heart-beat is too low\n");
	
	}
	
	else if(heart_rate > 100 ){
		printf("If you are not doing any physical work or exercise,then it is too high.\n\t You need to check-up.");
	}
	
	else{
		printf("Your heart-beat is Normal\n");
	}
	*/
	printf("Blood pressure of patient:%.2lf systolic mmHg %.2lf diastolic mmHg\n",randfrom(80.0,170),randfrom(50.0,100.0));
	/*
	if(systolic < 90){
		printf("You have Hypotension");
	}
	
	else if((systolic>90) && (systolic<120)){
		printf("You have normal health,It is desired\n");
	}
	
	else if(systolic>120){
		printf("You have hypertension,need checkup.");
	
	}
	
	*/
	}











void index_page()
	{ int ch;     
	  while(1)
		{	printf("1.Register\n2.Login\n3.Exit\nPress any key to continue...\n");
        	 	scanf("%d",&ch);
			system("clear");
			
	
			switch(ch)
			{
				case 1:reg();
				break;
				case 2:login();
				break;
				case 3:exit(rand());
                break;
				default:
				printf("Invalid input.Please try again\n");
			}			
		}
	}

















				
void login(){
	FILE *pas;
	FILE *pas2;
	
	int login_choice,match,match1,match2;
	int numb,i=0;
	
	char temp_id[20];
	char temp_pass[20];
	
	
	
	printf("1.Patient LogIn\n2.Doctor LogIn\nPress any key to continue......\n");
	
	scanf("%d",&login_choice);
		switch(login_choice)
			{
				case 1:{
					printf("Patient ID for login:");
					scanf("%s",temp_id);
					printf("Password:");
					scanf("%s",temp_pass);
					//This will validate password and userid
					
					pas=fopen("patient.txt","r");
					fscanf(pas,"%d",&numb);
					
					fseek(pas,1,SEEK_CUR);
						patient new_patient[numb];
						
						fread(new_patient,sizeof(patient),numb,pas);
						
					while(strcmp(temp_id,(new_patient+i)->patient_id))
						{
							i++;
							if(i==numb)
								{
									printf("Record not found.\n\t\tPlease try again\n..");
									fclose(pas);
									index_page();
								}
						
						}
						match=strcmp(temp_pass,(new_patient+i)->password);
						if(!match)
							{
								printf("\t\tWelcome %s You have been successfully logged In!!!",(new_patient+i)->name);
								patient_operation();
							}
						else
							{
								printf("Record not found....\nPlease try again..");
								fclose(pas);
								index_page();
							}
							printf("\n");
				}
						break;
				case 2:
					{
						printf("Doctor Id");
						scanf("%s",temp_id);
						printf("Password:");
						scanf("%s",temp_pass);
						
						pas2==fopen("doctor.txt","r");
						fscanf(pas2,1,SEEK_CUR);
							doctor new_doctor[numb];
							
							fread(new_doctor,sizeof(doctor),numb,pas2);
						int j=0;
						while(strcmp(temp_id,(new_doctor+j)->doctor_id))
							{
								j++;
								if(j==numb)
									{
										printf("Record not found...\n\t\tPlease try again\n");
										fclose(pas2);
										index_page();
									}
							match=strcmp(temp_pass,(new_doctor+j)->password);
							if(!match)
								{
									printf("\t\tWelcome %s you have successfully logged in!!!",(new_doctor+i)->name);
									doctor_operation();
								}
							else
								{
									printf("Record not found\n Please try again...");
									fclose(pas2);
									index_page();
								
								}
								printf("\n");
								
								}
							
							
							}
						
						break;
						
					default:
					{
						printf("Invalid Input\n");
						index_page();
					}		
					
				}
						
				
					
			}

		

void reg(){
	int num,i,j,register_choice;
	
	
	FILE *pas;
	FILE *pas2;
	printf("1.Patient register\n2.Doctor register\nPress any key to continue.....\n");
	
		scanf("%d",&register_choice);
		switch(register_choice)
			{
				case 1:
				{
					FILE *patient_pointer;
					patient_pointer = fopen("patient.txt","r");
					fscanf(patient_pointer,"%d",&num);
					fclose(patient_pointer);
					
					patient *new_patient;
					new_patient=(patient *)malloc(sizeof(patient));
					
					patient_pointer=fopen("patient.txt","a");
					
					if(patient_pointer==NULL){
						printf("Error in opening file:\n");
						return;
							}
						printf("Enter patient name:");
						scanf("\n%[^\n]%*c",new_patient->name);
						printf("Email:");
						scanf("%s",new_patient->email);
						printf("Enter patient date of birth:");
						scanf("%d %d %d",new_patient->patient_dob.dd,new_patient->patient_dob.mm,new_patient->patient_dob.yyyy);
						//getAge(new_patient->patient_dob.dd,new_patient->patient_dob.mm,new_patient->patient_dob.yyyy);
						printf("Enter patient-ID");
						scanf("%s",new_patient->patient_id);
						printf("Enter Password");
						scanf("%s",new_patient->password);
					
					fwrite(new_patient,sizeof(patient),1,patient_pointer);
					fclose(patient_pointer);
					num++;
					patient_pointer=fopen("patient.txt","r+");
					
					fprintf(patient_pointer,"%d",num);
					fclose(patient_pointer);
					
				}
					break;
					
				case 2:
				{
					FILE *doctor_pointer;
					doctor_pointer = fopen("doctor.txt","r");
					fscanf(doctor_pointer,"%d",&num);
					fclose(doctor_pointer);
					
					doctor *new_doctor;
					new_doctor=(doctor *)malloc(sizeof(doctor));
					
					doctor_pointer=fopen("doctor.txt","a");
					
					if(doctor_pointer==NULL){
						printf("Error in opening file:\n");
						return;
							}
						printf("Enter doctor name:");
						scanf("\n%[^\n]%*c",new_doctor->name);
						printf("Email");
						scanf("%s",new_doctor->email);
						printf("Enter doctor-ID");
						scanf("%s",new_doctor->doctor_id);
						printf("Enter Password");
						scanf("%s",new_doctor->password);
					
					fwrite(new_doctor,sizeof(doctor),1,doctor_pointer);
					fclose(doctor_pointer);
					num++;
					doctor_pointer=fopen("doctor.txt","r+");
					
					fprintf(doctor_pointer,"%d",num);
					fclose(doctor_pointer);
					
				}
					break;
				default:
					{
						printf("Invalid Input\n");
						//what happens when wrong
					}		

					
				
				
				
			}
		}
	

int main(){
	index_page();

return 0;
		}
	



	
